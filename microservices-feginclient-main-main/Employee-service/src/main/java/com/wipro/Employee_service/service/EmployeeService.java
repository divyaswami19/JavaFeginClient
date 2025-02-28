package com.wipro.Employee_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Employee_service.entity.Employee;
import com.wipro.Employee_service.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;



	public Employee saveEmploye(Employee empData) {
		Employee employee=repo.save(empData);
		return employee;
		
	}

	public List<Employee> getEmployeesByPid(Integer pid) {
		
		return repo.findByPid( pid);
	}

	

}
