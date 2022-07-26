package com.cybage.dao;

import java.util.List;

import com.cybage.pojo.FoodItem;

public interface FoodItemDao {
	public List<FoodItem> getFoodItemsByCategory(int restaurantId, String foodCategory);
	public List<FoodItem> getFoodItemsByRestaurant(int restaurantId);
	public FoodItem findByFoodId(int foodId);
	public List<FoodItem> searchFood(String str);
}
