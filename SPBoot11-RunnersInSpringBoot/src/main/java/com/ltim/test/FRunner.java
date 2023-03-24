package com.ltim.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-1)
public class FRunner implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("FRunner.run()");
	}
	
	@Override
	public int getOrder() {
		return -11;
	}

}
