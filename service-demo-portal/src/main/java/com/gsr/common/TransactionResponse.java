package com.gsr.common;

import com.gsr.model.Order;

public class TransactionResponse {
	
	private Order order;
	// private Payment payment;
	
	private String transactionId;
	private int amount;
	private String message;
	
	public TransactionResponse() {
		super();
	}

	public TransactionResponse(Order order, String transactionId, int amount, String message) {
		super();
		this.order = order;
		this.transactionId = transactionId;
		this.amount = amount;
		this.message = message;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "TransactionResponse [order=" + order + ", transactionId=" + transactionId + ", amount=" + amount
				+ ", message=" + message + "]";
	}
	

}
