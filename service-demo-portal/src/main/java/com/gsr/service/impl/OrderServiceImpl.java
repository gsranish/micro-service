package com.gsr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gsr.common.Payment;
import com.gsr.common.TransactionRequest;
import com.gsr.common.TransactionResponse;
import com.gsr.model.Order;
import com.gsr.repo.OrderRepository;

@Service
public class OrderServiceImpl {
	
	@Autowired
	private OrderRepository orderRepo;
	
	@Autowired
	private RestTemplate template;
	
	// public Order saveOrder(Order order) {
	public TransactionResponse saveOrder(TransactionRequest request) {
		
		Order order=request.getOrder();
		Payment payment =request.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice().intValue());
		// rest call 
		//Payment paymentResponse =template.postForObject("http://localhost:2021/payment/payment", payment, Payment.class); // using rest template
		Payment paymentResponse =template.postForObject("http://Brand-Demo-Portal/payment/payment", payment, Payment.class); // using Eureka config
		String message=paymentResponse.getPaymentStatus().equals("success")?"payment processing succesful and order placed":"payment failed, order added to cart";
		 orderRepo.save(order);
		 return new TransactionResponse(order,paymentResponse.getTransactionId(),paymentResponse.getAmount(),message);
	}

}
