package com.ltim.beans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
		return "Your order is delivered with DTDC and Order id :: "+oid;
	}

}
