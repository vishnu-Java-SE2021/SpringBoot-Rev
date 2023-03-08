package com.ltim;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ltim.controller.EmployeeController;
import com.ltim.model.Employee;

@SpringBootApplication  //@ComponentScan + @Configuration + @EnableAutoConfiguration
public class SpBoot04LayeredApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpBoot04LayeredApplication.class, args);
	
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
		}
	
		((ConfigurableApplicationContext)ctx).close();
	}

}
