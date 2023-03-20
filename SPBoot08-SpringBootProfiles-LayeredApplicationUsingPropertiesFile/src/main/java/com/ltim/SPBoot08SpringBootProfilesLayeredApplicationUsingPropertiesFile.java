package com.ltim;

import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.ltim.controller.EmployeeController;
import com.ltim.model.Employee;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@SpringBootApplication  //@Configuration + @EnableAutoConfiguration + @ComponentScan 
public class SPBoot08SpringBootProfilesLayeredApplicationUsingPropertiesFile {

	@Bean("c3p0")
	@Profile("uat")
	public DataSource getC3p0DataSource() throws Exception{
		ComboPooledDataSource ds = new ComboPooledDataSource();
		ds.setDriverClass("oracle.jdbc.driver.OracleDriver");
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUser("scott");
		ds.setPassword("tiger");
		return ds;
	}
	
	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(SPBoot08SpringBootProfilesLayeredApplicationUsingPropertiesFile.class);
		
		app.setAdditionalProfiles("prod");
		
		ApplicationContext ctx = app.run(args);
	
		EmployeeController con = ctx.getBean("empCon",EmployeeController.class);
		
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Enter job1 :: ");
			String job1 = sc.nextLine().toUpperCase();
			
			System.out.print("Enter job2 :: ");
			String job2 = sc.nextLine().toUpperCase();
			
			System.out.print("Enter job3 :: ");
			String job3 = sc.nextLine().toUpperCase();
			
			
			List<Employee> empList = con.showAllEmployees(job1,job2,job3);
		
			System.out.println(empList.size()>0? "Records are there" : "No records");
			
//			for(Employee emp : empList) {		//Java 5v for each loop
//				System.out.println(emp);
//			}
			
//			empList.forEach(emp->{             //Java 8v lambda expression
//				System.out.println(emp);});
		
			
			empList.forEach(System.out::println);  //Java 8v method reference
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	
		((ConfigurableApplicationContext)ctx).close();
	}

}
