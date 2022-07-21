package com.cybage.service;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.User;

public class UserServiceImpl implements UserService {
	UserDao dao=new UserDaoImpl();
	
	@Override
	public void addUser(User user) {
		dao.addUser(user);
	}

}
