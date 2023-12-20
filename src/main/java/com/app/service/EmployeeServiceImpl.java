package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDao;
import com.app.pojos.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	@Override
	public List<Employee> getAllEmployees(Long id) {
		// TODO Auto-generated method stub
		return employeeDao.findByDeptId(id);
	}

}
