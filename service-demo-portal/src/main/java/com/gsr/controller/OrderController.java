package com.gsr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsr.common.TransactionRequest;
import com.gsr.common.TransactionResponse;
import com.gsr.service.impl.OrderServiceImpl;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderServiceImpl orderService;

	private static Logger LOG=LoggerFactory.getLogger(OrderController.class);

	@PostMapping("/book")
	// public Order bookOrder(@RequestBody Order order) {
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
		
		LOG.info(" BookOrder api started from Controller : "+System.currentTimeMillis());
		return orderService.saveOrder(request);
	}
}
