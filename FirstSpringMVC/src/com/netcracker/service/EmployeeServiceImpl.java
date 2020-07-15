package com.netcracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netcracker.dao.EmployeeDAO;
import com.netcracker.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDao;
	
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(id);
	}

}
