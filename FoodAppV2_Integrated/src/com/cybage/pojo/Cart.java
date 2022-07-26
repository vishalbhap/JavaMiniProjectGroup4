package com.cybage.pojo;

public class Cart {
	private int cartId;
	private int userId;
	private int foodId;
	
	public Cart() {
	}
	
	
	public Cart(int cartId, int userId, int foodId) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.foodId = foodId;
	}


	public Cart(int userId, int foodId) {
		super();
		this.userId = userId;
		this.foodId = foodId;
	}


	public int getCartId() {
		return cartId;
	}


	public void setCartId(int cartId) {
		this.cartId = cartId;
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


	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", foodId=" + foodId + "]";
	}

	
	
}
