package com.niit.ActivityStreamBackend.dao;
 import java.util.List;

	public interface UserCircleDao {

		boolean addUserToCircle(String emailId,String circleName);
		boolean deleteUserFromCircle(String emailId,String circleName);
		List<String> getUsersOfCircle(String circleName);
		boolean deleteUserfromCircle(String emailId, String circleName);
		List<String> getUsersofCircle(String circleName);
		
		//return only emailid of user
	}


