package com.cts.policyManagmentSystem.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cts.policyManagmentSystem.bean.User;


@Repository("registrationDAO")
public class RegistrationDAOImpl implements RegistrationDAO{

	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory sessionFactory;
	
	@Transactional
	public String addUser(User user) {
		// TODO Auto-generated method stub
		
		Session session = null;
		try {
		session = sessionFactory.getCurrentSession();
		
		session.save(user);
		user.setUserType("U");
			return "true";
		}
		catch(Exception e)
		{
		      e.printStackTrace();
		}
		return null;
	}

	@Transactional
	public String addAdmin(User user) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
		session = sessionFactory.getCurrentSession();
		
		session.save(user);
		user.setUserType("A");
			return "true";
		}
		catch(Exception e)
		{
		      e.printStackTrace();
		}
		return null;
		
	}
}
