package com.gsr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="kpf_rtp_rf_company_status")
public class Company_Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Length(max=50)
	private String STATUS_ID;
	@Length(max=50)
	private String STATUS_NAME;
	@Length(max=11)
	private int LIST_ORDER;
	@Length(max=50)
	private String DESCRIPTION;
	public String getSTATUS_ID() {
		return STATUS_ID;
	}
	public void setSTATUS_ID(String sTATUS_ID) {
		STATUS_ID = sTATUS_ID;
	}
	public String getSTATUS_NAME() {
		return STATUS_NAME;
	}
	public void setSTATUS_NAME(String sTATUS_NAME) {
		STATUS_NAME = sTATUS_NAME;
	}
	public int getLIST_ORDER() {
		return LIST_ORDER;
	}
	public void setLIST_ORDER(int lIST_ORDER) {
		LIST_ORDER = lIST_ORDER;
	}
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}
	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}
	@Override
	public String toString() {
		return "Company_Status [STATUS_ID=" + STATUS_ID + ", STATUS_NAME=" + STATUS_NAME + ", LIST_ORDER=" + LIST_ORDER
				+ ", DESCRIPTION=" + DESCRIPTION + "]";
	}
}
