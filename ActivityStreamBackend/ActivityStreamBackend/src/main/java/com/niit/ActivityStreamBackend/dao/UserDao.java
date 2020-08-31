package com.niit.ActivityStreamBackend.dao;
 import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

	public interface UserDao {

		public boolean save(User user);
		public boolean update(User user);
		public User get(String id);
		public List<com.niit.ActivityStreamBackend.model.User> list();
		public User validate(String id,String password);
		boolean save(com.niit.ActivityStreamBackend.model.User user);
		boolean update(com.niit.ActivityStreamBackend.model.User user);
		User validate(String id);
	}


