package com.ltim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ltim.comp.Customer;

@SpringBootApplication
public class SpBoot05ValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpBoot05ValueAnnotationApplication.class, args);
	
		Customer c = ctx.getBean("cust",Customer.class);
	
		System.out.println(c);
		System.out.println();
		System.out.println(System.getProperties());
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
