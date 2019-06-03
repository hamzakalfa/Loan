package com.bank.loan.beans;

import java.text.DecimalFormat;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LoanInfo {

	
	@Id @GeneratedValue
	private Long id_loaninfo;
	
	@Column(name = "LoanCommission", unique = false, nullable = false)
	private String LoanCommission;
	
	@Column(name = "LoanPaymentType", unique = false, nullable = false)
	private String LoanPaymentType;
	
	@Column(name = "LoanDuration", unique = false, nullable = false)
	private Integer LoanDuration;
	
	@Column(name = "LoanAmount", unique = false, nullable = false)
	private DecimalFormat LoanAmount;

	@OneToMany
	private List<LoanApplication> loanapplication;
	
	public List<LoanApplication> getLoanapplication() {
		return loanapplication;
	}

	public void setLoanapplication(List<LoanApplication> loanapplication) {
		this.loanapplication = loanapplication;
	}

	public LoanInfo() {
		super();
	}

	public Long getId_loaninfo() {
		return id_loaninfo;
	}

	public void setId_loaninfo(Long id_loaninfo) {
		this.id_loaninfo = id_loaninfo;
	}

	public String getLoanCommission() {
		return LoanCommission;
	}

	public void setLoanCommission(String loanCommission) {
		LoanCommission = loanCommission;
	}

	public String getLoanPaymentType() {
		return LoanPaymentType;
	}

	public void setLoanPaymentType(String loanPaymentType) {
		LoanPaymentType = loanPaymentType;
	}

	public Integer getLoanDuration() {
		return LoanDuration;
	}

	public void setLoanDuration(Integer loanDuration) {
		LoanDuration = loanDuration;
	}

	public DecimalFormat getLoanAmount() {
		return LoanAmount;
	}

	public void setLoanAmount(DecimalFormat loanAmount) {
		LoanAmount = loanAmount;
	}
	
	
	
}
