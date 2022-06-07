package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Utils.DateUtil;
import config.DaoConfig;
import config.HashPassword;
import models.User;
import sql.SQLStatements;

public class DAO {

	
	public static Connection con = null;
	HashPassword hash = new HashPassword();

	public DAO() throws Exception {
		try {
			Class.forName(DaoConfig.DB_DRIVER);
			con = DriverManager.getConnection(DaoConfig.URL, DaoConfig.USERNAME, DaoConfig.PASSWORD);
			con.setAutoCommit(true);
		} catch (Exception e) {
			throw new Exception("Couldn't open connection to database: " + e.getMessage());
		}
	}
	
	public boolean checkDuplicate(String key, String input) throws SQLException {
		
		boolean checker = true;
		String selectStatement = "select * from " +  DaoConfig.TABLE_NAME + " where " + key + " = ?";
		
		PreparedStatement prepStmt = con.prepareStatement(selectStatement);
		
		prepStmt.setString(1, input);
		
		ResultSet rs = prepStmt.executeQuery();
		if(!rs.next()) {
			checker = false;
		} 
		return checker;
	}
	
	public void regUser(User user) throws Exception {

		String directory = System.getProperty("user.home");
		File imgfile = new File(directory + "/lifeX/LifeX/WebContent/images/user.png");
		user.setTimeStamp(DateUtil.getCurrentTimestamp());
		FileInputStream fin = new FileInputStream(imgfile);

		PreparedStatement prepStmt = con.prepareStatement(SQLStatements.insertUser());
		prepStmt.setString(1, user.getUsername());
		prepStmt.setString(2, user.getPassword());
		prepStmt.setString(3, user.getFirstName());
		prepStmt.setString(4, user.getLastName());

		prepStmt.setString(5, user.getEmail());
		prepStmt.setString(6, user.getBio());
		prepStmt.setString(7, user.getFriends());
		prepStmt.setString(8, user.getFriendRequest());
		prepStmt.setTimestamp(9, user.getTimeStamp());
		prepStmt.setBinaryStream(10, (InputStream)fin, (int)imgfile.length());
		prepStmt.setTimestamp(11, null);
		prepStmt.setString(12, "");

		prepStmt.executeUpdate();
			
	}
	
	public void updateTokenNTimestamp(String token, Timestamp timestamp, String email) throws SQLException{
		PreparedStatement prepStmt = con.prepareStatement(SQLStatements.updateTokenNTimestamp());
		prepStmt.setString(1, token);
		prepStmt.setString(2, email);
		prepStmt.setTimestamp(3, timestamp);
		prepStmt.setString(4, email);
		
		prepStmt.executeUpdate();
	}
	
	public User isUser(String username, String password) throws Exception {
		User user = new User();
		String encryptedPassword = hash.hashPassword(password);
		
		PreparedStatement prepStmt = con.prepareStatement(SQLStatements.selectUser());
		prepStmt.setString(1, username);
		prepStmt.setString(2, encryptedPassword);
		ResultSet rs = prepStmt.executeQuery();
		if (rs.next()) {
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setFirstName(rs.getString("first_name"));
			user.setLastName(rs.getString("last_name"));
			user.setEmail(rs.getString("email"));
			user.setBio(rs.getString("bio"));
			user.setFriends(rs.getString("friends"));
			user.setFriendRequest(rs.getString("friend_request"));
			user.setTimeStamp(rs.getTimestamp("time_stamp"));
			user.setPhoto(rs.getBlob("profile_pic"));
			user.setPassword(rs.getString("password"));
		} else {
			user = null;
		}

		return user;
	}
	
	public String getUsername(String input) throws SQLException {
		PreparedStatement prepStmt = con.prepareStatement(SQLStatements.getUsername());
		prepStmt.setString(1, input);

		ResultSet rs = prepStmt.executeQuery();
		if(rs.next()) {
			return rs.getString("username");
		} 
		return "";
	}
	
	public JSONArray getAllUserDetails() throws SQLException, JSONException {
		JSONArray jsonArray = new JSONArray();
		PreparedStatement prepStmt = con.prepareStatement(SQLStatements.getAllUser());
		ResultSet rs = prepStmt.executeQuery();
		while(rs.next()) {
			JSONObject json = new JSONObject();
			User user = new User();	
			json.put("id", rs.getInt("id"));
			json.put("username", rs.getString("username"));
			json.put("first_name", rs.getString("first_name"));
			json.put("last_name", rs.getString("last_name"));
			json.put("email", rs.getString("email"));
			json.put("bio", rs.getString("bio"));
			json.put("friends", rs.getString("friends"));
			json.put("friend_request", rs.getString("friend_request"));
			json.put("time_stamp", rs.getString("time_stamp"));
			json.put("profile_pic", rs.getString("profile_pic"));
			
			jsonArray.put(json);
		}
		return jsonArray;
	}

}
