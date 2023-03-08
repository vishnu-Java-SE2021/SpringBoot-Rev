package com.ltim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.model.Employee;
import com.ltim.repo.IEmployeeRepo;

@Service  //=> @Component + able to perform transaction management operations
public class EmployeeManagementImpl implements IEmployeeManagement {

	@Autowired
	IEmployeeRepo empRepo;
	
	@Override
	public List<Employee> fetchAllEmployees(String job1, String job2, String job3) throws Exception {
		
		List<Employee> empList = empRepo.getAllEmployees(job1, job2, job3);
		
		return empList;
	}

}
