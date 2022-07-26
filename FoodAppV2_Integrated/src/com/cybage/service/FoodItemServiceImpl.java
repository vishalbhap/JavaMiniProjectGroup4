package com.cybage.service;

import java.util.List;

import com.cybage.dao.FoodItemDao;
import com.cybage.dao.FoodItemDaoImpl;
import com.cybage.pojo.FoodItem;

public class FoodItemServiceImpl implements FoodItemService {
	public FoodItemDao dao=new FoodItemDaoImpl();
	@Override
	public List<FoodItem> getFoodItemsByCategory(int restaurantId, String foodCategory) {
		return dao.getFoodItemsByCategory(restaurantId, foodCategory);
	}
	
	@Override
	public List<FoodItem> getFoodItemsByRestaurant(int restaurantId) {
		return dao.getFoodItemsByRestaurant(restaurantId);
	}

	@Override
	public FoodItem findByFoodId(int foodId) {
		return dao.findByFoodId(foodId);
	}
}
