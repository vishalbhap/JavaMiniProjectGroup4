package com.cybage.pojo;

public class Restaurant {
	private int restaurantId;
	private String restaurantName;
	private String restaurantUserName;
	private String password;
	private int pincode;
	private String email;
	private String address;
	
	public Restaurant() {
		
	}
	
	public Restaurant(String restaurantName, String restaurantUserName, String password, int pincode, String email,
			String address) {
		this.restaurantName = restaurantName;
		this.restaurantUserName = restaurantUserName;
		this.password = password;
		this.pincode = pincode;
		this.email = email;
		this.address = address;
	}

	public Restaurant(int restaurantId, String restaurantName, String restaurantUserName, String password, int pincode,
			String email, String address) {
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantUserName = restaurantUserName;
		this.password = password;
		this.pincode = pincode;
		this.email = email;
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantUserName() {
		return restaurantUserName;
	}
	public void setRestaurantUserName(String restaurantUserName) {
		this.restaurantUserName = restaurantUserName;
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
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName
				+ ", restaurantUserName=" + restaurantUserName + ", password=" + password + ", pincode=" + pincode
				+ ", email=" + email + ", address=" + address + "]";
	}
	
}
