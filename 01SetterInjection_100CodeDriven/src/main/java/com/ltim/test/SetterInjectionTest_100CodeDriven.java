package com.ltim.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ltim.beans.WishMessageGenerator;
import com.ltim.cfgs.AppConfig;

public class SetterInjectionTest_100CodeDriven {
    public static void main( String[] args ){
        
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	WishMessageGenerator wmg = ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);
    	
    	String result = wmg.getMessage("Airtel");
    	
    	System.out.println(result);
    	
    	ctx.close();
    	
    }
}
