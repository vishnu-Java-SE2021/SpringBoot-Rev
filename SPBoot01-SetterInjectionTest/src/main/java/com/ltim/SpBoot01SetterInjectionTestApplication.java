package com.ltim;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ltim.beans.WishMessageGenerator;

@SpringBootApplication
public class SpBoot01SetterInjectionTestApplication {

	@Bean("ldt")
	public LocalDateTime getDate() {
		System.out.println("SpBoot01SetterInjectionTestApplication.getDate()");
		return LocalDateTime.now();
	}
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpBoot01SetterInjectionTestApplication.class, args);
	
		WishMessageGenerator wmg = ctx.getBean("wmg",WishMessageGenerator.class);
		
		String result = wmg.getMessage("rolex");
		
		System.out.println(result);
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
