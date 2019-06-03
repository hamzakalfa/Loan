package com.bank.loan.beans;

import java.text.DecimalFormat;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Liability {

	
	@Id @GeneratedValue
	private Long id_Liability;
	
	@Column(name = "LiabilityType", unique = false, nullable = false)
	private String LiabilityType;
	
	@Column(name = "AmountLoaned", unique = false, nullable = false)
	private DecimalFormat AmountLoaned;
	
	@Column(name = "AmountRemaining", unique = false, nullable = false)
	private DecimalFormat AmountRemaining;
	
	@Column(name = "MonthlyPayment", unique = false, nullable = false)
	private DecimalFormat MonthlyPayment;

	@OneToMany
	private List<LoanApplication> loanapplication;
	
	public List<LoanApplication> getLoanapplication() {
		return loanapplication;
	}

	public void setLoanapplication(List<LoanApplication> loanapplication) {
		this.loanapplication = loanapplication;
	}

	public Liability() {
		super();
	}

	public Long getId_Liability() {
		return id_Liability;
	}

	public void setId_Liability(Long id_Liability) {
		this.id_Liability = id_Liability;
	}

	public String getLiabilityType() {
		return LiabilityType;
	}

	public void setLiabilityType(String liabilityType) {
		LiabilityType = liabilityType;
	}

	public DecimalFormat getAmountLoaned() {
		return AmountLoaned;
	}

	public void setAmountLoaned(DecimalFormat amountLoaned) {
		AmountLoaned = amountLoaned;
	}

	public DecimalFormat getAmountRemaining() {
		return AmountRemaining;
	}

	public void setAmountRemaining(DecimalFormat amountRemaining) {
		AmountRemaining = amountRemaining;
	}

	public DecimalFormat getMonthlyPayment() {
		return MonthlyPayment;
	}

	public void setMonthlyPayment(DecimalFormat monthlyPayment) {
		MonthlyPayment = monthlyPayment;
	}
	
	
	
}
