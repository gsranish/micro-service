package com.gsr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsr.dto.Message;


@RestController
@RequestMapping("/brand")
public class BrandController {
	
	private static Logger LOG=LoggerFactory.getLogger(BrandController.class);
	
	
	@GetMapping("/msg")
	public ResponseEntity<?> showMsg() {
		LOG.info(" showMsg api started "+System.currentTimeMillis());
		ResponseEntity<?> resp=null;
		try {
			resp=new ResponseEntity<Message>(new Message("SUCCESS","message","message"),HttpStatus.OK);
		}catch(Exception e) {
			resp=new ResponseEntity<Message>(new Message("ERROR",e.getMessage(),"error"),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
		
	}

}
