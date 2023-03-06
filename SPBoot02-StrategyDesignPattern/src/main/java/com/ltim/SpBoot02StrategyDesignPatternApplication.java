package com.ltim;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ltim.comp.Vehicle;

@SpringBootApplication  //@ComponentScan, @Configuration, @EnableAutoConfiguration
public class SpBoot02StrategyDesignPatternApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpBoot02StrategyDesignPatternApplication.class, args);
	
		Vehicle vh = ctx.getBean("veh",Vehicle.class);
		
		vh.journey("Bangalore", "Hyderabad");
		
		((ConfigurableApplicationContext)ctx).close();
		
	}

}
