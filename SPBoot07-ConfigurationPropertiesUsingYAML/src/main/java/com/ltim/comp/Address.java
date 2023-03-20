package com.ltim.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component("add")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "add.info")
public class Address {

	int stNo;
	String city;
	String state;
}
