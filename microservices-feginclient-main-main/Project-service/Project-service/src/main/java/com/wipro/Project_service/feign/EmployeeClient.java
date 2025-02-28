package com.wipro.Project_service.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.wipro.Project_service.client.Employee;

@FeignClient(name="Employee-service",path ="/employee")
public interface EmployeeClient {
	
	@GetMapping("/project/{pid}")
    List<Employee> findEmployeeByPid(@PathVariable("pid") int pid);
	

}
