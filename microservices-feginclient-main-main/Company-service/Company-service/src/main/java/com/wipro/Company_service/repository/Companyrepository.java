package com.wipro.Company_service.repository;

import com.wipro.Company_service.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Companyrepository extends JpaRepository<Company, Long>{
    Optional<Company> findByPcode(Long pcode);
}
