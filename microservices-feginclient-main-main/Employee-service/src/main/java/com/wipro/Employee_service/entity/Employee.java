package com.wipro.Employee_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee 
{
	@Id
	public int empId;
	public String empName;
	public String username;
	public String password;
	public String email;
	public String phoneNumber;
	public int age;
	public int pid;

}

