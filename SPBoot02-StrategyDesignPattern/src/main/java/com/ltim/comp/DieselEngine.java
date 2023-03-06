package com.ltim.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dEng")
@Primary
public class DieselEngine implements Engine {

	@Override
	public String start() {
		return "Diesel Engine is started...";
	}

	@Override
	public String stop() {
		return "Diesel Engine is stopped...";
	}

}
