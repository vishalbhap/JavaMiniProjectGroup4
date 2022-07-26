package com.cybage.dao;

import java.util.List;

import com.cybage.pojo.Cart;

public interface CartDao {
	public void addCart(Cart cart);
	public List<Cart> showCart();
	public void deleteCart(int foodId);
}
