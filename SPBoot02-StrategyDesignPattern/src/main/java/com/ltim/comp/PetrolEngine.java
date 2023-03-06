package com.ltim.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pEng")
@Primary   //<bean id="pEng" class="c.l.c.PetrolEngine" primary="true"/>
public class PetrolEngine implements Engine {

	@Override
	public String start() {
		return "Petrol Engine is started...";
	}

	@Override
	public String stop() {
		return "Petrol Engine is stopped...";
	}

}
