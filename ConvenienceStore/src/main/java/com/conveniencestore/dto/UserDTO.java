package com.conveniencestore.dto;

public class UserDTO {

	private String userId;
	
	private String userPwd;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userPwd=" + userPwd + "]";
	}
	
}
