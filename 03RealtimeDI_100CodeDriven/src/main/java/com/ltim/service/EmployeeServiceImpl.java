package com.ltim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ltim.dao.IEmployeeDAO;

@Component("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDAO empDao;
	
	@Override
	public int fetchEmployeesCount() {
		return empDao.getEmployeesCount();
	}

}
