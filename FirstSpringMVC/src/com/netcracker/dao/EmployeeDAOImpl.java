package com.netcracker.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.netcracker.dto.Employee;
import com.netcracker.mapping.EmployeeRowMapper;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	 @Autowired
	 JdbcTemplate jdbcTemplate;
	
	@Override
	public Employee getEmployeeById(int id) {
		
		 String selectQuey="select *from employee where emp_id=?";
		 
		 Object param[]=new Object[]{id};
		 
		return jdbcTemplate.queryForObject(selectQuey, param, new EmployeeRowMapper());
		  
	
	}


}
