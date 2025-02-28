package com.wipro.Employee_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.Employee_service.entity.Employee;
import com.wipro.Employee_service.service.EmployeeService;

import io.micrometer.common.lang.Nullable;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping
	public Employee saveEmployee(@Nullable @RequestBody Employee empData)
	{
		
		return service.saveEmploye(empData);
		
	}
	

	@GetMapping("/project/{pid}")
	public List<Employee> getEmployeesbyPid(@PathVariable int pid )
	{
		
		return service.getEmployeesByPid(pid);
		
	}
	

	
	

 }
