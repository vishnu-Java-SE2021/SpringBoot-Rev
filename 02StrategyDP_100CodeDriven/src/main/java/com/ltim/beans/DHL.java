package com.ltim.beans;

import org.springframework.stereotype.Component;

@Component("dhl")  
public class DHL implements Courier {

	@Override
	public String deliver(int oid) {
		return "Your order is delivered by DHL with order id ::"+oid;
	}

}
