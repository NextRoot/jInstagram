package org.jinstagram.entity.users.basicinfo;

import com.google.gson.annotations.SerializedName;

public class UserInfoLogin {
	@SerializedName("id")
	private String id;
	
	@SerializedName("username")
	private String username;
	
	@SerializedName("full_name")
	private String fullName;
	
	@SerializedName("profile_picture")
	private String profilePicture;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getProfilePicture() {
		return profilePicture;
	}
	
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	
	@Override
	public String toString() {
		return String.format("UserInfoLogin [id=%s, username=%s, full_name=%s, profile_picture=%s]", id, username, fullName, profilePicture);
	}
}

