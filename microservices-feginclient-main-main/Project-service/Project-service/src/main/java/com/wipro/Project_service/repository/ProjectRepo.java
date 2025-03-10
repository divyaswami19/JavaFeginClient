package com.wipro.Project_service.repository;

import com.wipro.Project_service.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectRepo  extends JpaRepository<Project,Integer> {

    List<Project> findByPcode(Long pcode);
    Project findByPid(int pid);
}
