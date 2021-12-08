package com.dealsandcouponsfinder.profilemanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Profile")
public class Profile {

	@Id
	private String emailId;
	@Field
	private String fullName;
	@Field
	private String mobileNo;
	@Field
	private String preferences;
	@Field
	private String password;
	@Field
	private String role;

	public Profile(String emailId, String fullName, String mobileNo, String preferences, String password) {
		super();
		this.emailId = emailId;
		this.fullName = fullName;
		this.mobileNo = mobileNo;
		this.preferences = preferences;
		this.password = password;
		this.role = "user";
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPreferences() {
		return preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
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

	@Override
	public String toString() {
		return "Profile [emailId=" + emailId + ", fullName=" + fullName + ", mobileNo=" + mobileNo + ", preferences="
				+ preferences + ", password=" + password + ", role=" + role + "]";
	}

}
