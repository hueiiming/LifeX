package models;

import java.sql.Blob;
import java.sql.Timestamp;

public class User {
	private int id;
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private String bio;
	private Blob photo;
	private String friends;
	private String friendRequest;
	private Timestamp timeStamp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	public String getFriends() {
		return friends;
	}
	public void setFriends(String friend) {
		this.friends = friend;
	}
	public String getFriendRequest() {
		return friendRequest;
	}
	public void setFriendRequest(String friendRequest) {
		this.friendRequest = friendRequest;
	}
	public Timestamp getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}
}
