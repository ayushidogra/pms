package com.cts.policyManagmentSystem.service;

import com.cts.policyManagmentSystem.bean.User;

public interface RegistrationService {
	public String addAdmin(User user);
	public String addUser(User user);
}
