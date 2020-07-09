package com.gsr.service.impl;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gsr.model.Company;
import com.gsr.repo.CompanyRepo;
import com.gsr.service.CompanyService;


@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyRepo companyRepo;
	
	private static Logger LOG=Logger.getLogger(CompanyServiceImpl.class);

	@Override
	public List<Company> getAllCompanies() {
		return companyRepo.findAll();
	}

	@Override
	public Optional<Company> getCompanyById(Long companyId) {
		return companyRepo.findById(companyId);
	}

	@Override
	public Long saveCompany(Company company) {
		Company comp=companyRepo.save(company);
		return comp.getCOMPANY_ID();
	}

	@Override
	public Company updateCompany(Long companyId) {
		LOG.info("updateCompany from service impl class");
		Company c=new Company();
		try {
			Optional<Company> company=companyRepo.findById(companyId);
			if(company.isPresent()) {
				c=company.get();
			}
		}catch(Exception e) {
			LOG.info("Exception occureed in"+e.getMessage());
		}
		return companyRepo.save(c);
	}
}
