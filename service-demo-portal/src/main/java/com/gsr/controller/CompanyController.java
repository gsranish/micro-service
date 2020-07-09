package com.gsr.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsr.model.Company;
import com.gsr.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	private static Logger LOG=Logger.getLogger(CompanyController.class);
	
	// This API will save company object
	@PostMapping("/save")
	public ResponseEntity<?> saveCompany(@RequestBody Company requestBody) {
		LOG.info("saveCompany api started "+System.currentTimeMillis());
		ResponseEntity<Map>  resp=null;
		try {
			Long id=companyService.saveCompany(requestBody);
			Map<String,Object> map=new LinkedHashMap<String, Object>();
			resp=new ResponseEntity<Map>(map,HttpStatus.OK);
			map.put("STATUS","Success");
			map.put("Result", "Input Details : "+requestBody.toString());
			map.put("Message", "Company details are saved with "+id);
		}catch(Exception e ) {
			Map<String,Object> map=new LinkedHashMap<String, Object>();
			map.put("STATUS", "ERROR");
			map.put("RESULT", e.getMessage());
			map.put("Message", "Error occurred in saveCompany API");
			resp=new ResponseEntity<Map>(map,HttpStatus.INTERNAL_SERVER_ERROR);
			LOG.info("Exception in saveCompany api "+e.getMessage());
		}
		return resp;
	}
	
	// This API will return company details on company id
	@PostMapping("/id")
	public ResponseEntity<?> getCompanybyId(@RequestBody Company requestBody){
		ResponseEntity<?> resp=null;
		try {
			LOG.info("getCompanyById api started "+System.currentTimeMillis());
			Long companyId=requestBody.getCOMPANY_ID();
			Optional<Company> company=companyService.getCompanyById(companyId);
			LOG.info(company.toString());
			Map<String,Object> map=new LinkedHashMap<String, Object>();
			map.put("STATUS","Success");
			map.put("Result", company);
			map.put("Message", "Company details are fetched with "+companyId);
			resp=new ResponseEntity<Map>(map,HttpStatus.OK);
		}catch(Exception e) {
			Map<String,Object> map=new LinkedHashMap<String, Object>();
			map.put("STATUS", "ERROR");
			map.put("RESULT", e.getMessage());
			map.put("Message", "Error occurred in getCompanybyId API");
			resp=new ResponseEntity<Map>(map,HttpStatus.INTERNAL_SERVER_ERROR);
			LOG.info("Exception in getAllCompany api "+e.getMessage());
		}
		return resp;
	}
	// This API will list all company details
	@GetMapping("/all")
	public ResponseEntity<?> getAllCompany(){
		LOG.info("getAllCompany api started "+System.currentTimeMillis());
		ResponseEntity<?> resp=null;
		try {
			List<Company> list=companyService.getAllCompanies();
			if(list !=null && !list.isEmpty()) {
				Map<String,Object> map=new LinkedHashMap<String, Object>();
				map.put("STATUS", "SUCCESS");
				map.put("Result",list);
				map.put("Message","All company details fetched");
				resp=new ResponseEntity<Map>(map,HttpStatus.OK);
			}
		}catch(Exception e) {
			Map<String,Object> map=new LinkedHashMap<String, Object>();
			map.put("STATUS", "ERROR");
			map.put("Result",e.getMessage());
			map.put("Message","Error occurred in getAllCompany API");
			resp=new ResponseEntity<Map>(map,HttpStatus.INTERNAL_SERVER_ERROR);
			LOG.info("exception in getAllCompany api "+e.getMessage());
		}
		return resp;
	}
}
