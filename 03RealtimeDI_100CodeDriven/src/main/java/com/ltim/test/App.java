package com.ltim.test;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ltim.cfgs.AppConfig;
import com.ltim.controller.EmployeeController;

public class App {
    public static void main( String[] args ){
    
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    
    	EmployeeController con = ctx.getBean("empCon",EmployeeController.class);
    	
    	DataSource ds = ctx.getBean("ds",DataSource.class);
    	
    	System.out.println(ds);
    	
    	int result = con.getEmployeesCount();
    	
    	System.out.println("Number of Employees :: "+result);
    	
    	ctx.close();
    }
}
