package com.cybage.service;

import java.util.List;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.pojo.Restaurant;
import com.cybage.pojo.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao = new UserDaoImpl();
	
	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	@Override
	public List<Restaurant> searchByArea(int pin) {
		return userDao.searchByArea(pin);
	}
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

	@Override
	public Integer deleteUser(int userId) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(userId);
	}
}
