package com.ltim;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ltim.dao.EmployeeMySqlDAOImpl;
import com.ltim.dao.IEmployeeDAO;
import com.ltim.model.Employee;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@SpringBootApplication
public class SpBoot03AutoConfigurationApplication {

	@Bean
	public DataSource getDataSourceObj() throws Exception{
		ComboPooledDataSource ds = new ComboPooledDataSource();
		
		ds.setDriverClass("com.mysql.cj.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/springdb");
		ds.setUser("root");
		ds.setPassword("root");
		
		return ds;
	}
	
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
