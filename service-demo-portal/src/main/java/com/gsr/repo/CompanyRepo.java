package com.gsr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gsr.model.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Long>{
	
	

}
