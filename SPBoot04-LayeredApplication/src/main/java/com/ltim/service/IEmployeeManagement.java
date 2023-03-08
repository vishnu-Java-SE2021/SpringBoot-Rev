package com.ltim.service;

import java.util.List;

import com.ltim.model.Employee;

public interface IEmployeeManagement {

	public List<Employee> fetchAllEmployees(String job1,String job2,String job3) throws Exception;
}
