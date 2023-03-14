package com.ltim.comp;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component("emp")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "emp.info")
public class Employee {

	@Value("${emp.info.eno}")
	int empno;
	
	String ename;
	
	String eph;
	
	Address addrs;
	
	String[] hobbies;
	
	List<String> studies;   //1.Fixed size,2. only Homogeneous Data(same type), 
							//3. No methods to perform operations

	Set<String> phoneNumbers;
	
	Map<String,Object> details;

	public void setEmpno(int empno) {
		System.out.println("Setter method()");
		this.empno=empno;
	}
}
