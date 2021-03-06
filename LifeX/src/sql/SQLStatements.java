package sql;

import config.DaoConfig;
import config.DaoStaticNames;

public class SQLStatements {
	
	public static String getAllUser() {
		return "SELECT * FROM " + DaoConfig.TABLE_NAME;
	}
	
	public static String insertUser() {
		return "INSERT INTO " + DaoConfig.TABLE_NAME 
				+ " (username, password, first_name, last_name, "
				+ "email, bio, friends, friend_request, "
				+ "time_stamp, profile_pic, expiry_timestamp, token) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
	}
	
	public static String selectUser() {
		return "SELECT * FROM " + DaoConfig.TABLE_NAME
				+ " WHERE " + DaoStaticNames.USERNAME + " = ? "
				+ " AND " + DaoStaticNames.PASSWORD + " = ?";
	}
	
	public static String getUsername() {
		return "SELECT " + DaoStaticNames.USERNAME + " FROM " + DaoConfig.TABLE_NAME
				+ " WHERE " + DaoStaticNames.EMAIL + " = ?";
	}
	
	public static String updateTokenNTimestamp() {
		return "UPDATE " + DaoConfig.TABLE_NAME + 
				" SET (TOKEN = ? WHERE EMAIL = ?) AND (EXPIRY_TIMESTAMP = ? WHERE EMAIL = ?)";
	}
	
	
	
}
