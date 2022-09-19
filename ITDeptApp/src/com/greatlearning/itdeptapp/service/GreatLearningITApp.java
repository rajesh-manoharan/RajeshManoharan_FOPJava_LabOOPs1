package com.greatlearning.itdeptapp.service;

import com.greatlearning.itdeptapp.model.Employee;
import com.greatlerning.itdeptapp.util.generateUniquePassword;

public class GreatLearningITApp implements CredentialServiceModel {
	private static int passwordLength = 8;
	private static String domain = ".gl.in";
	public String generatePassword() {
		String getpass = (generateUniquePassword.generatePass(passwordLength));
		return getpass;
	}
	
	public String generateEmailAddress(Employee employee) {
		return employee.getFirstName() + employee.getLastName() + "@" + employee.getDepartment() + domain;
	}
	
	public void showCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email                       --> " + employee.getEmailId());
		System.out.println("Password                    --> " + employee.getPassword());
	}
}

