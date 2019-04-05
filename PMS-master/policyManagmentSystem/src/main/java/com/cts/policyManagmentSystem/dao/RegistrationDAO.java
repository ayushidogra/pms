package com.cts.policyManagmentSystem.dao;

import com.cts.policyManagmentSystem.bean.User;

public interface RegistrationDAO {
	
		public String addAdmin(User user);
		public String addUser(User user);
}
