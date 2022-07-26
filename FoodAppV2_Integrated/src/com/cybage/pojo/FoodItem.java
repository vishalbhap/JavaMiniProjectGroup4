package com.cybage.pojo;

public class FoodItem {
	private int foodId;
	private String foodName;
	private String foodCategory;
	private double price;
	private double offer;
	
	public FoodItem() {
		// TODO Auto-generated constructor stub
	}

	public FoodItem(int foodId, String foodName, String foodCategory, double price, double offer) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodCategory = foodCategory;
		this.price = price;
		this.offer = offer;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodCategory() {
		return foodCategory;
	}

	public void setFoodCategory(String foodCategory) {
		this.foodCategory = foodCategory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getOffer() {
		return offer;
	}

	public void setOffer(double offer) {
		this.offer = offer;
	}

	@Override
	public String toString() {
		return "FoodItems [foodId=" + foodId + ", foodName=" + foodName + ", foodCategory=" + foodCategory + ", price="
				+ price + ", offer=" + offer + "]";
	}
	
}
