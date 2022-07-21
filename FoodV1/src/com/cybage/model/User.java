package com.cybage.model;

public class User {
	
	private int userId;
	private String name;
	private String email;
	private String password;
	private String contactNo;
	private String gender;
	private String role;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String name, String email, String password, String contactNo, String gender, String role) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.contactNo = contactNo;
		this.gender = gender;
		this.role = role;
	}
	
	
	public User(String name, String email, String password, String contactNo, String gender, String role) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.contactNo = contactNo;
		this.gender = gender;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userid=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", contactNo=" + contactNo + ", gender=" + gender + ", role=" + role + "]";
	}
	
	

}
