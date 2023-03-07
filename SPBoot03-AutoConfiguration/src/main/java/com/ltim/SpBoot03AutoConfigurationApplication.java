package com.ltim;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ltim.dao.EmployeeMySqlDAOImpl;
import com.ltim.dao.IEmployeeDAO;
import com.ltim.model.Employee;

@SpringBootApplication
public class SpBoot03AutoConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpBoot03AutoConfigurationApplication.class, args);
	
//		IEmployeeDAO empDao = ctx.getBean("empOraDAO", EmployeeOraDAOImpl.class);
		IEmployeeDAO empDao = ctx.getBean("empMySqlDao", EmployeeMySqlDAOImpl.class);
		
		List<Employee> empList = empDao.getEmployees();
		
		for(Employee emp : empList) {
			System.out.println(emp);
		}
	
	}

}
