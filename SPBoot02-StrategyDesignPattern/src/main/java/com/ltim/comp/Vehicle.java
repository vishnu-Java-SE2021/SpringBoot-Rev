package com.ltim.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("veh") //<bean id="veh" class="com.ltim.comp.Vehicle.class" />
public class Vehicle {
	
	@Autowired
	@Qualifier("dEng")
	Engine engine;	
	
	public void journey(String startPlace,String endPlace) {
		System.out.println(engine.start());
		System.out.println("Journey started from : "+startPlace);
		System.out.println(engine.stop());
		System.out.println("Journey ended at : "+endPlace);
	}
}
