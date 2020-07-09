package com.gsr.dto;

public class Message {
	
	private String STATUS;
	
	private String MESSAGE;
	
	private String RESULT;

	public Message(String sTATUS, String mESSAGE, String rESULT) {
		super();
		STATUS = sTATUS;
		MESSAGE = mESSAGE;
		RESULT = rESULT;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getMESSAGE() {
		return MESSAGE;
	}

	public void setMESSAGE(String mESSAGE) {
		MESSAGE = mESSAGE;
	}

	public String getRESULT() {
		return RESULT;
	}

	public void setRESULT(String rESULT) {
		RESULT = rESULT;
	}

	@Override
	public String toString() {
		return "Message [STATUS=" + STATUS + ", MESSAGE=" + MESSAGE + ", RESULT=" + RESULT + "]";
	}
}