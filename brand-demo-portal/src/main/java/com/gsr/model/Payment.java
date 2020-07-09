package com.gsr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT_DB")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String paymentStatus;
	private String transactionId;
	
	private Long orderId;
	private int amount;
	
	
	public Payment() {
		super();
	}
	public Payment(Long id, String paymentStatus, String transactionId) {
		super();
		this.id = id;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
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
