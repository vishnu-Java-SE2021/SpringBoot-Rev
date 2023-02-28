package com.ltim.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {

	@Autowired
	private Date date;
	
	public String getMessage(String user) {
					
			int hour = date.getHours();
					
			if(hour<12)
				return "Good Morning "+user;
			else if(hour<16)
				return "Good Afternoon "+user;
			else if(hour<20)
				return "Good Evening "+user;
			else
				return "Good Night "+user;
		
	}
	
}
