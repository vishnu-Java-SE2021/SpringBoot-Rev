package com.ltim.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component("cust")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Value("1")
	int cid;
	
	@Value("${cust.name}")
	String cname;
	
	@Value("${cust.ph}")
	String cph;
	
	@Value("#{add}")       //SPEL (Spring Expression Language - #)
	Address add;

	@Value("#{add.distFromOfc+add.distToBS}")
	int totalJourney;
	
//	@Value("${Path}")
//	String path;
	
	@Value("${os.name}")
	String osName;
	
	//1. User defined properties file
	//2. Application properties file
	//3. Environment variables
	//4. System properties
	
}
