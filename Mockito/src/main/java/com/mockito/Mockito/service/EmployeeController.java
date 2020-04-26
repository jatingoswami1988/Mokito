package com.mockito.Mockito.service;

public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public int getProjectedEmployeeCount() {
		int actualEmployeeCount = employeeService.getEmployeeCount();
		return actualEmployeeCount * 2;
	}

	public void saveEmployee(Employee employee) {
		employeeService.saveEmployee(employee);
	}

}
