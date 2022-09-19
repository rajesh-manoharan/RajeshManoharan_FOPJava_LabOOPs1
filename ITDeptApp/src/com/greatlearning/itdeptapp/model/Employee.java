package com.greatlearning.itdeptapp.model;


public class Employee {
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String department;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getPassword() {
		return password;
	}
	public String getDepartment() {
		return department;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", password="
				+ password + ", department=" + department + "]";
	}

}
