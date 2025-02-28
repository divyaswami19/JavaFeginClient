package com.wipro.Employee_service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.Employee_service.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

	Employee findByUsername(String username);
	List<Employee> findByPid(Integer pid);
	

}
