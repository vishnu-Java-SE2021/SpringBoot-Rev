package com.ltim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ltim.service.IEmployeeService;

@Component("empCon")
public class EmployeeController {
	
	@Autowired
	IEmployeeService empService;
	
	public int getEmployeesCount() {
						
		return empService.fetchEmployeesCount();
	}
}
