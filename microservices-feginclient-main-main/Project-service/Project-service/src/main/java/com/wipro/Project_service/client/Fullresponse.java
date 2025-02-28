package com.wipro.Project_service.client;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fullresponse {
	 public int pid;
	    public String name;
	    public String description;
	    public String status;
	    public String start_date;
	    public String end_date;
	    public String poc;
	    public String poc_email;
	    public double budget;
	    public Long pcode;
	    public List<Employee> employeeList;

}
