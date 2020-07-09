package com.gsr.service;

import java.util.List;
import java.util.Optional;


import com.gsr.model.Company;

public interface CompanyService {

	public List<Company> getAllCompanies();
	public Optional<Company> getCompanyById(Long companyId);
	
	public Long saveCompany(Company company);
	
	public Company updateCompany(Long companyId);
}
