package com.ltim.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.ltim.model.Employee;

@Repository  //=> @Component + capable of converting SQL exceptions to Spring related exceptions
@Profile({"test","dev","local","default"})
public class EmployeeMySQLRepoImpl implements IEmployeeRepo{

	private final String GET_ALL_EMPS = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?)";

	@Autowired
	DataSource ds;
	
	public EmployeeMySQLRepoImpl() {
		System.out.println("EmployeeMySQLRepoImpl.EmployeeMySQLRepoImpl()");
	}

	@Override
	public List<Employee> getAllEmployees(String job1, String job2, String job3) throws Exception{
		
		List<Employee> empList;
		
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_ALL_EMPS)){
			
			ps.setString(1, job1);
			ps.setString(2, job2);
			ps.setString(3, job3);
			
			ResultSet rs = ps.executeQuery();
			
			System.out.println("DataSource class name :: "+ds.getClass());
			
			empList = new ArrayList<>();
			
			while(rs.next()) {
				Employee e = new Employee();
				
				e.setEmpNo(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setJob(rs.getString(3));
				e.setSal(rs.getDouble(4));
				
				empList.add(e);
			}
			
		}catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		
		return empList;
	}

}
