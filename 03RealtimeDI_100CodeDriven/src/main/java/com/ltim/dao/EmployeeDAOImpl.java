package com.ltim.dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("empDao")
public class EmployeeDAOImpl implements IEmployeeDAO {

	private final String RETRIEVE_QUERY = "SELECT count(*) FROM EMP";
	
	@Autowired
	DataSource ds;
	
	@Override
	public int getEmployeesCount() {
				
		
		int result = 0;
		
		try {
			Connection con = ds.getConnection();
			
			PreparedStatement ps = con.prepareStatement(RETRIEVE_QUERY);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt(1);
			}
				
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
