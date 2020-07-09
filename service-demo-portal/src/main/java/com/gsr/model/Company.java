package com.gsr.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="rtp_company_master",uniqueConstraints = {
		@UniqueConstraint(columnNames = "COMPANY_NAME",name = "uniqueNameConstraint")
})
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @Length(max=11)
	private Long COMPANY_ID;
	@Length(max=60)
	@NotNull
	@Column(unique = true)
	private String COMPANY_NAME;
	@Length(max=200)
	private String REGISTERED_ADDRESS;
	@Length(max=50)
	private String CITY;
	@Length(max=50)
	private String STATE;
	@Length(max=50)
	private String COUNTRY;
	@Length(max=20)
	private String PINCODE;
	@Length(max=20)
	private String CONTACT_NO;
	@Length(max=150)
	private String EMAIL;
	
	private Date REG_DATE;
	@Length(max=200)
	private String Website;
	@Length(max=25)
	@NotNull
	private String CIN_NUMBER;
	@Length(max=20)
	private String PANCARD;
	@Length(max=20)
	private String GSTIN;
	@Length(max=10)
	private String SUBSCRIPTION_ST;
	@Length(max=200)
	private String LOGO_URL;
	
	private Date EXPIRY_DATE;
	
	private Date CREATED_DATE;
	public Long getCOMPANY_ID() {
		return COMPANY_ID;
	}
	public void setCOMPANY_ID(Long cOMPANY_ID) {
		COMPANY_ID = cOMPANY_ID;
	}
	public String getCOMPANY_NAME() {
		return COMPANY_NAME;
	}
	public void setCOMPANY_NAME(String cOMPANY_NAME) {
		COMPANY_NAME = cOMPANY_NAME;
	}
	public String getREGISTERED_ADDRESS() {
		return REGISTERED_ADDRESS;
	}
	public void setREGISTERED_ADDRESS(String rEGISTERED_ADDRESS) {
		REGISTERED_ADDRESS = rEGISTERED_ADDRESS;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	public String getSTATE() {
		return STATE;
	}
	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}
	public String getCOUNTRY() {
		return COUNTRY;
	}
	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}
	public String getPINCODE() {
		return PINCODE;
	}
	public void setPINCODE(String pINCODE) {
		PINCODE = pINCODE;
	}
	public String getCONTACT_NO() {
		return CONTACT_NO;
	}
	public void setCONTACT_NO(String cONTACT_NO) {
		CONTACT_NO = cONTACT_NO;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public Date getREG_DATE() {
		return REG_DATE;
	}
	public void setREG_DATE(Date rEG_DATE) {
		REG_DATE = rEG_DATE;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public String getCIN_NUMBER() {
		return CIN_NUMBER;
	}
	public void setCIN_NUMBER(String cIN_NUMBER) {
		CIN_NUMBER = cIN_NUMBER;
	}
	public String getPANCARD() {
		return PANCARD;
	}
	public void setPANCARD(String pANCARD) {
		PANCARD = pANCARD;
	}
	public String getGSTIN() {
		return GSTIN;
	}
	public void setGSTIN(String gSTIN) {
		GSTIN = gSTIN;
	}
	public String getSUBSCRIPTION_ST() {
		return SUBSCRIPTION_ST;
	}
	public void setSUBSCRIPTION_ST(String sUBSCRIPTION_ST) {
		SUBSCRIPTION_ST = sUBSCRIPTION_ST;
	}
	public String getLOGO_URL() {
		return LOGO_URL;
	}
	public void setLOGO_URL(String lOGO_URL) {
		LOGO_URL = lOGO_URL;
	}
	public Date getEXPIRY_DATE() {
		return EXPIRY_DATE;
	}
	public void setEXPIRY_DATE(Date eXPIRY_DATE) {
		EXPIRY_DATE = eXPIRY_DATE;
	}
	public Date getCREATED_DATE() {
		return CREATED_DATE;
	}
	public void setCREATED_DATE(Date cREATED_DATE) {
		CREATED_DATE = cREATED_DATE;
	}
	
	
}
