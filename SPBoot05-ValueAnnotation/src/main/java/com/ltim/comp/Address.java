package com.ltim.comp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component("add")
@Data
@AllArgsConstructor
@NoArgsConstructor
@PropertySource("classpath:input.properties")
public class Address {
	
	@Value("20")
	int streetNo;
	
	@Value("20")
	int distToBS;
	
	@Value("30")
	int distFromOfc;
	
	@Value("${add.city}")
	String city;
	
	@Value("${add.state}")
	String state;
	
}

