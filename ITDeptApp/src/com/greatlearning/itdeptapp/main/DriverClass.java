package com.greatlearning.itdeptapp.main;

import java.util.Scanner;

import com.greatlearning.itdeptapp.model.Employee;
import com.greatlearning.itdeptapp.service.CredentialServiceModel;
import com.greatlearning.itdeptapp.service.GreatLearningITApp;

public class DriverClass {
	private static String[] department = {"Technical","Admin","Human Resource","Legal"};
	private static String[] departmentAbbr = {"tech","admin","hr","legal"};
	public static void main(String args []) {
		
		CredentialServiceModel service = new GreatLearningITApp();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String firstName = scanner.nextLine();
		System.out.println("Please enter your last name:");
		String lastName = scanner.nextLine();
		Employee employee = new Employee(firstName,lastName);
		System.out.println("Please enter the department from the following");
		for (int dept=1;dept<=4;dept++) {
			System.out.println(dept+ ". " + department[dept-1]);
		}
		int deptEntered = scanner.nextInt();
		employee.setDepartment(departmentAbbr[deptEntered-1]);
		String generatedPassword = service.generatePassword();
		employee.setPassword(generatedPassword);
		
		String email = service.generateEmailAddress(employee);
		employee.setEmailId(email);
		
		service.showCredentials(employee);
		scanner.close();
		
	}
}
