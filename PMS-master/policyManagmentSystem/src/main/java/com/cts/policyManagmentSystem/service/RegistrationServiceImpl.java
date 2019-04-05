package com.cts.policyManagmentSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.policyManagmentSystem.bean.User;
import com.cts.policyManagmentSystem.dao.RegistrationDAO;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	RegistrationDAO registrationDAO;

	
	public String addUser(User user) {
		// TODO Auto-generated method stub
		return registrationDAO.addUser(user);
	}


	@Override
	public String addAdmin(User user) {
		// TODO Auto-generated method stub
		return registrationDAO.addAdmin(user);
	}
	

}
