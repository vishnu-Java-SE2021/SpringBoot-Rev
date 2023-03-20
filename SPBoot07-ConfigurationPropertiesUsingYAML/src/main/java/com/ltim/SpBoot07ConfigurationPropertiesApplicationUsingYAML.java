package com.ltim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ltim.comp.Address;
import com.ltim.comp.Employee;

@SpringBootApplication
public class SpBoot07ConfigurationPropertiesApplicationUsingYAML {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpBoot07ConfigurationPropertiesApplicationUsingYAML.class, args);
		
		Employee e = ctx.getBean("emp",Employee.class);
	
		Address add = ctx.getBean("add",Address.class);
		
		System.out.println(e);
		System.out.println(add);
		
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
