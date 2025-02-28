package com.wipro.Project_service.service;



import com.wipro.Project_service.client.Employee;
import com.wipro.Project_service.client.Fullresponse;
import com.wipro.Project_service.entity.Project;
import com.wipro.Project_service.feign.EmployeeClient;
import com.wipro.Project_service.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjcetService {
    @Autowired
    private ProjectRepo repo;
    
    @Autowired
    private EmployeeClient client;
    public Project createProject(Project project) {

        return repo.save(project);
    }

    public List<Project> getProject(Long pcode) {
        return repo.findByPcode(pcode);
    }


	public Fullresponse findprojectByPid(int pid) {
		 Project project=repo.findByPid(pid);
	        List<Employee> list=client.findEmployeeByPid(pid);
	        Fullresponse  res=new Fullresponse();
	        res.setPid(project.getPid());
	        res.setName(project.getName());
	        res.setBudget(project.getBudget());
	        res.setDescription(project.getDescription());
	        res.setPcode(project.getPcode());
	        res.setEnd_date(project.getEnd_date());
	        res.setPoc(project.getPoc());
	        res.setPoc_email(project.getPoc_email());
	        res.setStart_date(project.getStart_date());
	        res.setStatus(project.getStatus());
	        res.setEmployeeList(list);
		return res ;
	}
}
