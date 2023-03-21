package com.ltim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ltim.model.Employee;
import com.ltim.service.IEmployeeManagement;

@Controller("empCon") //=> @Component + ability to take http requests
public class EmployeeController {

	@Autowired
	IEmployeeManagement empService;
	
	public List<Employee> showAllEmployees(String job1,String job2, String job3) throws Exception{
		
		List<Employee> empList = empService.fetchAllEmployees(job1,job2,job3);
		
		return empList;
	}
}
