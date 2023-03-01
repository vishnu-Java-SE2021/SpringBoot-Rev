package com.ltim.beans;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements Courier {

	@Override
	public String deliver(int oid) {
			return "Your order is delivered with BlueDart and Order id :: "+oid;
	}

}
