package com.cts.policyManagmentSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.policyManagmentSystem.bean.Policy;
import com.cts.policyManagmentSystem.bean.UserPolicy;
import com.cts.policyManagmentSystem.dao.UserDAO;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO userDAO;
	
	
	@Override
	public List<Policy> getPolicyByType() {
		// TODO Auto-generated method stub
		return userDAO.getPolicyByType();
	}

	@Override
	public List<Policy> getPolicyById() {
		// TODO Auto-generated method stub
		return userDAO.getPolicyById();
	}

	@Override
	public List<Policy> getPolicyByYears() {
		// TODO Auto-generated method stub
		return userDAO.getPolicyByYears();
	}

	@Override
	public List<Policy> getPolicyByCompany() {
		// TODO Auto-generated method stub
		return userDAO.getPolicyByCompany();
	}

	@Override
	public List<Policy> getPolicyByName() {
		// TODO Auto-generated method stub
		return userDAO.getPolicyByName();
	}

	@Override
	public String addPolicy(UserPolicy userPolicy, String policyId, String userId) {
		// TODO Auto-generated method stub
		return userDAO.addPolicy(userPolicy,policyId, userId);
	}

}
