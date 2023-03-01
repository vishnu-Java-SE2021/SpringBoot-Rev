package com.ltim.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ltim.beans.Flipkart;
import com.ltim.cfgs.AppConfig;

public class App {
    public static void main( String[] args ){

    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    
    	Flipkart fpk = ctx.getBean("fpk",Flipkart.class);
    	
    	String result = fpk.shopping(new String[] {"shirt","Pant"}, new double[] {500.0,600.0});
    
    	System.out.println(result);
    	
    	ctx.close();
    }
}
