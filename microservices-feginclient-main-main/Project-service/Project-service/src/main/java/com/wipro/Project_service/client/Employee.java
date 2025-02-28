package com.wipro.Project_service.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	public Long empId;
	public String empName;
	public String username;
	public String password;
	public String email;
	public String phoneNumber;
	public int age;
	public int pid;


}
