package com.gsr.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="kpf_rtp_tx_company_band")
public class Company_Band {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Length(max = 20)
	private long ID;
	
	@Length(max = 11)
	private int BRAND_ID;
	
	@Length(max = 50)
	private String BAND_ID;
	
	private Timestamp SUBSCRIPTION_DATE;
	
	private Timestamp EXPIRY_DATE;
	@Length(max=50)
	private String STATUS;
}
