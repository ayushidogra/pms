package com.cts.policyManagmentSystem.dao;

import java.util.List;

import com.cts.policyManagmentSystem.bean.Policy;
import com.cts.policyManagmentSystem.bean.UserPolicy;

public interface UserDAO {
	
	public List<Policy> getPolicyByType();
	public List<Policy> getPolicyById();
	public List<Policy> getPolicyByYears();
	public List<Policy> getPolicyByCompany();
	public List<Policy> getPolicyByName();
	public String addPolicy(UserPolicy userPolicy, String policyId, String userId);
}
