package com.ltim.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class BRunner implements CommandLineRunner,Ordered{

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("BRunner.run()");
	}
	
	@Override
	public int getOrder() {
		return 10;
	}

}
