 package com.bank.loan.beans;

import java.text.DecimalFormat;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class CreditDecision {

	@Id @GeneratedValue
	private Long id_CreditDecision;
	
	@Column(name = "CreditWorthless", unique = false, nullable = false)
	private DecimalFormat CreditWorthless;
	
	@Column(name = "Scoring", unique = false, nullable = false)
	private DecimalFormat Scoring;
	
	@Column(name = "CreditScore", unique = false, nullable = false)
	private String CreditScore;
	
	@Column(name = "Miscellaneous1", unique = false, nullable = false)
	private Integer Miscellaneous1;
	
	@Column(name = "Miscellaneous2", unique = false, nullable = false)
	private Integer Miscellaneous2;
	
	@Column(name = "Miscellaneous3", unique = false, nullable = false)
	private Integer Miscellaneous3;
	
	@Column(name = "LiabilitiesDeclaredVsReported", unique = false, nullable = false)
	private DecimalFormat LiabilitiesDeclaredVsReported;
	
	@Column(name = "AntifraudVerification", unique = false, nullable = false)
	private String AntifraudVerification;
	
	@Column(name = "Comments", unique = false, nullable = false)
	private String Comments;
	
	@Column(name = "Decision", unique = false, nullable = false)
	private String Decision;
	
	@Column(name = "Remarks", unique = false, nullable = false)
	private String Remarks;

	@OneToMany
	private List<LoanApplication> loanapplication;
	
	public List<LoanApplication> getLoanapplication() {
		return loanapplication;
	}

	public void setLoanapplication(List<LoanApplication> loanapplication) {
		this.loanapplication = loanapplication;
	}

	public CreditDecision() {
		super();
	}

	public Long getId_CreditDecision() {
		return id_CreditDecision;
	}

	public void setId_CreditDecision(Long id_CreditDecision) {
		this.id_CreditDecision = id_CreditDecision;
	}

	public DecimalFormat getCreditWorthless() {
		return CreditWorthless;
	}

	public void setCreditWorthless(DecimalFormat creditWorthless) {
		CreditWorthless = creditWorthless;
	}

	public DecimalFormat getScoring() {
		return Scoring;
	}

	public void setScoring(DecimalFormat scoring) {
		Scoring = scoring;
	}

	public String getCreditScore() {
		return CreditScore;
	}

	public void setCreditScore(String creditScore) {
		CreditScore = creditScore;
	}

	public Integer getMiscellaneous1() {
		return Miscellaneous1;
	}

	public void setMiscellaneous1(Integer miscellaneous1) {
		Miscellaneous1 = miscellaneous1;
	}

	public Integer getMiscellaneous2() {
		return Miscellaneous2;
	}

	public void setMiscellaneous2(Integer miscellaneous2) {
		Miscellaneous2 = miscellaneous2;
	}

	public Integer getMiscellaneous3() {
		return Miscellaneous3;
	}

	public void setMiscellaneous3(Integer miscellaneous3) {
		Miscellaneous3 = miscellaneous3;
	}

	public DecimalFormat getLiabilitiesDeclaredVsReported() {
		return LiabilitiesDeclaredVsReported;
	}

	public void setLiabilitiesDeclaredVsReported(DecimalFormat liabilitiesDeclaredVsReported) {
		LiabilitiesDeclaredVsReported = liabilitiesDeclaredVsReported;
	}

	public String getAntifraudVerification() {
		return AntifraudVerification;
	}

	public void setAntifraudVerification(String antifraudVerification) {
		AntifraudVerification = antifraudVerification;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public String getDecision() {
		return Decision;
	}

	public void setDecision(String decision) {
		Decision = decision;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	
	
	
}
