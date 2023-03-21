package com.ltim.repo;

import java.util.List;

import com.ltim.model.Employee;

public interface IEmployeeRepo {

	public List<Employee> getAllEmployees(String job1,String job2,String job3) throws Exception;
}
