package com.ltim;  //com.ltim.....

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ltim.beans.WishMessageGenerator;

@SpringBootApplication  //=> @ComponentScan, @Configuration, @EnableAutoConfiguration
public class Boot01SetterInjectionTestApplication {
	
	@Bean("ldt")
	public Calendar toGetDate() {
		return Calendar.getInstance();
	}
	
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Boot01SetterInjectionTestApplication.class, args);
	
		WishMessageGenerator wmg = ctx.getBean("wmg",WishMessageGenerator.class);
		
		String result = wmg.getMessage("Rolex");
		
		System.out.println(result);
		System.out.println(ctx);
		System.out.println(ctx.containsBean("wmg"));
		System.out.println(ctx.getBeanDefinitionCount());
		
	}

}
