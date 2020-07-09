package com.gsr.dto;

public class Message {
	
	private String status;
	private String result;
	private String message;
	
	
	public Message() {
		super();
	}


	public Message(String status, String result, String message) {
		super();
		this.status = status;
		this.result = result;
		this.message = message;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "Message [status=" + status + ", result=" + result + ", message=" + message + "]";
	}
	

}
