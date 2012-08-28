package org.jinstagram.entity.users.basicinfo;

import com.google.gson.annotations.SerializedName;

public class UserInfoLoginResponse {
	@SerializedName("user")
	private UserInfoLogin user;
	
	public UserInfoLogin getUser() {
		return user;
	}
	
	public void setUser(UserInfoLogin user) {
		this.user = user;
	}
}
