package com.mockito.Mockito;

import org.junit.jupiter.api.Test;

import com.mockito.Mockito.service.EmployeeController;
import com.mockito.Mockito.service.EmployeeService;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PowerMockitoExample extends TestCase {

	@Test
	public void getEmployeeCount() {
		EmployeeController employeeController = new EmployeeController(new EmployeeService());
		Assert.assertEquals(10, employeeController.getProjectedEmployeeCount());
	}

}
