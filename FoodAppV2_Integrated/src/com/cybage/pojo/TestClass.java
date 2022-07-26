package com.cybage.pojo;

import com.cybage.pojo.Restaurant;

import com.cybage.service.FoodItemService;
import com.cybage.service.FoodItemServiceImpl;
import com.cybage.service.RestaurantServiceImpl;

public class TestClass {

	public static void main(String[] args) {
//		Restaurant rest=new Restaurant("Arihant", "arihant", "arihant_123", 411033);
//		RestaurantServiceImpl service=new RestaurantServiceImpl();
//		System.out.println(rest);
//		service.addRestaurant(rest);
		
		
//		for (Restaurant restaurant : service.viewAllResataurant()) {
//			System.out.println(restaurant);
//		}
		
		
		
//		RestaurantMenu menu=new RestaurantMenu(2, 100, "lunch");
//		RestaurantMenuService service=new RestaurantMenuServiceImpl();
//		service.addRestaurantMenu(menu);
//		System.out.println(service.viewAllFoodCategory(2));
//		service.updateFoodCategory(1, "lunch", "dinner");
//		System.out.println(service.viewAllFoodCategory(1));
		
//		System.out.println(service.deleteFoodCategory("lunch", 2));
		
		FoodItemService s = new FoodItemServiceImpl();
//		System.out.println(s.getFoodItemsByRestaurant(108));
		
		System.out.println(s.findByFoodId(501));
	}

}
