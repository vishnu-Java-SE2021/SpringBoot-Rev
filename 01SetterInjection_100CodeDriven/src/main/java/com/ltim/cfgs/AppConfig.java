package com.ltim.cfgs;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ltim")
public class AppConfig {

	@Bean   //<bean id="dt" class="java.util.Date"/>
	public Date getDate() {
		return new Date();
	}
}
