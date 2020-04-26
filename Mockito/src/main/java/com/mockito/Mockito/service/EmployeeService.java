package com.mockito.Mockito.service;

public class EmployeeService {

	public int getEmployeeCount() {
		throw new UnsupportedOperationException();
	}

	public void saveEmployee(Employee employee) {
		System.out.println("Saving Employee");
	}
}
