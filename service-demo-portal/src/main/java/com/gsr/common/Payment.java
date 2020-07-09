package com.gsr.common;

public class Payment {
	
	private Long id;
	private String paymentStatus;
	private String transactionId;
	private Long orderId;
	private int amount;
	public Payment() {
		super();
	}
	public Payment(Long id, String paymentStatus, String transactionId, Long orderId, int amount) {
		super();
		this.id = id;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
		this.orderId = orderId;
		this.amount = amount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", paymentStatus=" + paymentStatus + ", transactionId=" + transactionId
				+ ", orderId=" + orderId + ", amount=" + amount + "]";
	}

	
}
