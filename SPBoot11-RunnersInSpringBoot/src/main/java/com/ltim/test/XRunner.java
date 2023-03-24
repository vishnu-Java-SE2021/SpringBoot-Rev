package com.ltim.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-3)
public class XRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("XRunner.run()");
	}

}

//A--->CLR 20
//B--->CLR 0,10   ==>     
//C--->AR  -10  ===> CDXABF
//D--->AR  -20  ===> DCXFBA
//F--->CLR  -1,-11  ==> CFBADX    ==> DCFBAX  / DFCBAX
//X--->AR   -3   ==> CBADXF  