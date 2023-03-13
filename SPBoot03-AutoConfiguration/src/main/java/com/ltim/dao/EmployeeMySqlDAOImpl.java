package com.ltim.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ltim.model.Employee;

@Component("empMySqlDao")
public class EmployeeMySqlDAOImpl implements IEmployeeDAO {

	private final String SELECT_QUERY = "SELECT ENO,ENAME,EADD,ENSAL FROM EMPLOYEE";
	
	@Autowired
	DataSource ds;
	
	public EmployeeMySqlDAOImpl() {
		System.out.println("EmployeeMySqlDAOImpl.EmployeeDAOImpl() :: 0-param constructor");
	}
	
	@Override
	public List<Employee> getEmployees(){
	
		System.out.println("Datasource impl class :: "+ds.getClass());
		
		List<Employee> empList = new ArrayList<>();
		
		try {
			Connection con = ds.getConnection();
			System.out.println("Connection impl class :: "+con.getClass());
			
			PreparedStatement ps = con.prepareStatement(SELECT_QUERY);
			System.out.println("PreparedStatement impl class :: "+ps.getClass());
			
			ResultSet rs = ps.executeQuery();
			System.out.println("ResultSet impl class :: "+rs.getClass());
			
			while(rs.next()) {
				Employee emp = new Employee();
				
				emp.setEmpNo(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setEsal(rs.getString(4));
				
				empList.add(emp);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return empList;
	}

}
