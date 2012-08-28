package org.jinstagram.auth.model;

import org.jinstagram.entity.users.basicinfo.UserInfoLogin;

public class TokenWithUserInfo {
	private Token token;
	
	private UserInfoLogin user;
	
	public Token getToken() {
		return token;
	}
	
	public void setToken(Token token) {
		this.token = token;
	}
	
	public UserInfoLogin getUser() {
		return user;
	}
	
	public void setUser(UserInfoLogin user) {
		this.user = user;
	}
	
	public TokenWithUserInfo(Token token, UserInfoLogin user) {
		this.token = token;
		this.user = user;
	}
}
