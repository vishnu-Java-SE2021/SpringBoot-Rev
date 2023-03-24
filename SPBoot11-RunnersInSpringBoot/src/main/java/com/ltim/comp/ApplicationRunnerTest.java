package com.ltim.comp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(-10)
public class ApplicationRunnerTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ApplicationRunnerTest.run()");		
		System.out.println(args.getNonOptionArgs());
		System.out.println(args.getOptionNames());
		System.out.println(args.getOptionValues("name"));
		System.out.println("==============================================");
	}

}
