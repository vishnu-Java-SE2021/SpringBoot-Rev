package com.ltim.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpk")
public class Flipkart {

	//HAS-A property
	@Autowired
	@Qualifier("courierType")
	private Courier courier;

	public  String shopping(String items[],double price[]) {
			
			double total = 0;
			
			for(int i=0;i<price.length;i++) {
				total+=price[i];
			}
			
			String status = courier.deliver(1234);
			
			return status+" bill amount :: "+total;
	}
}
