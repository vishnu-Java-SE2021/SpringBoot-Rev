package com.ltim.comp;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(-1)
public class CommandLineRunnerTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("CommandLineRunnerTest.run()");
		
		System.out.println(Arrays.toString(args));
	}

}
