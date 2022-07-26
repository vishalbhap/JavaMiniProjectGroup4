package com.cybage.pojo;

public class User {
	private int userId;
	private String userName;
	private String password;
	private int pincode;
	private String address;
	private String email;
	private String phoneNumber;
	public User() {
		
	}
	public User(int userId, String userName, String password, int pincode, String address, String email,
			String phoneNumber) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.pincode = pincode;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", pincode=" + pincode
				+ ", address=" + address + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
