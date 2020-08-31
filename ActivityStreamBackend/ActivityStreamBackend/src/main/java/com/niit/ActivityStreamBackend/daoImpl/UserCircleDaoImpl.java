package com.niit.ActivityStreamBackend.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ActivityStreamBackend.dao.UserCircleDao;
import com.niit.ActivityStreamBackend.model.Circle;
import com.niit.ActivityStreamBackend.model.User;
import com.niit.ActivityStreamBackend.model.UserCircle;
@Repository(value="usercircleDao")
public class UserCircleDaoImpl implements UserCircleDao {
	@Autowired  
    private SessionFactory sessionFactory; 

	@Override
	public boolean addUserToCircle(String emailId, String circleName) {
		 boolean status=false;  
	        try {  
	            sessionFactory.getCurrentSession().save(emailId,circleName);  
	            status=true;  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return status;
	}

	public boolean deleteUserfromCircle(String emailId, String circleName) {
		boolean status=false;  
        try {  
            sessionFactory.getCurrentSession().delete(emailId,circleName);  
            status=true;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return status;  
	}

	public List<String> getUsersofCircle(String circleName) {
		return (List<String>) sessionFactory.getCurrentSession().get(UserCircle.class, circleName);
	}

	@Override
	public boolean deleteUserFromCircle(String emailId, String circleName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getUsersOfCircle(String circleName) {
		// TODO Auto-generated method stub
		return null;
	}

}

