package com.cybage.pojo;

public class OrderFood {
	private int orderId;
	private int userId;
	private int foodId;
	private String orderStatus;
	private int bill;
	private String deliveryAddress;
	
	
	
	public OrderFood(int userId, int foodId, String orderStatus, int bill, String deliveryAddress) {
		super();
		this.userId = userId;
		this.foodId = foodId;
		this.orderStatus = orderStatus;
		this.bill = bill;
		this.deliveryAddress = deliveryAddress;
	}

	public OrderFood(int orderId, int userId, int foodId, String orderStatus, int bill, String deliveryAddress) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.foodId = foodId;
		this.orderStatus = orderStatus;
		this.bill = bill;
		this.deliveryAddress = deliveryAddress;
	}
	
	public OrderFood() {
		super();
	}
	public OrderFood(int orderId) {
		super();
		this.orderId = orderId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	@Override
	public String toString() {
		return "OrderFood [orderId=" + orderId + ", userId=" + userId + ", foodId=" + foodId + ", orderStatus="
				+ orderStatus + ", bill=" + bill + ", deliveryAddress=" + deliveryAddress + "]";
	}
	
	
	
}
