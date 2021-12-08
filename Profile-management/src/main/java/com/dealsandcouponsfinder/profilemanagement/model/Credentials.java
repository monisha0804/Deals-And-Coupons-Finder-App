package com.dealsandcouponsfinder.profilemanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Credentials")
public class Credentials {
	@Id
	private String emailId;
	@Field
	private String password;
	@Field
	private String role;
	@Field
	private String loginStatus;

	public Credentials() {
		super();
	}

	public Credentials(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public Credentials(String emailId, String password, String role, String loginStatus) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.role = role;
		this.loginStatus = loginStatus;
	}

	@Override
	public String toString() {
		return "Credentials [emailId=" + emailId + ", password=" + password + ", role=" + role + ", loginStatus="
				+ loginStatus + "]";
	}

}
