package com.greatlearning.itdeptapp.service;

import com.greatlearning.itdeptapp.model.Employee;

public interface CredentialServiceModel {

	String generatePassword();
	String generateEmailAddress(Employee employee);
	void showCredentials(Employee employee);
}