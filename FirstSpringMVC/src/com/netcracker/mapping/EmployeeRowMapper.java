package com.netcracker.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.netcracker.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowCount) throws SQLException {
		
		return new Employee(rs.getInt(1),rs.getString(2), rs.getFloat(3));
	}

}
