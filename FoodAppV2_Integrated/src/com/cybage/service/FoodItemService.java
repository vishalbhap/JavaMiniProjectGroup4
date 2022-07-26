package com.cybage.service;

import java.util.List;

import com.cybage.pojo.FoodItem;

public interface FoodItemService {
	public List<FoodItem> getFoodItemsByCategory(int restaurantId, String foodCategory);
	public List<FoodItem> getFoodItemsByRestaurant(int restaurantId);
	public FoodItem findByFoodId(int foodId);
}
