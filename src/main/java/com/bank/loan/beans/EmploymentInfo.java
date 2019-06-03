 package com.bank.loan.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EmploymentInfo {

	

	@Id @GeneratedValue
	private Long id_Employmentinfo;
	
	@Column(name = "Employer", unique = false, nullable = false)
	public String Employer;
	
	@Column(name = "EmploymentDuration", unique = false, nullable = false)
	public String EmploymentDuration;
	
	@Column(name = "YearlyIncome", unique = false, nullable = false)
	public String YearlyIncome;
	
	@Column(name = "EmploymentStatus", unique = false, nullable = false)
	public String EmploymentStatus;

	@OneToMany
	private List<LoanApplication> loanapplication;
	
	public List<LoanApplication> getLoanapplication() {
		return loanapplication;
	}

	public void setLoanapplication(List<LoanApplication> loanapplication) {
		this.loanapplication = loanapplication;
	}

	public EmploymentInfo() {
		super();
	}

	public Long getId_Employmentinfo() {
		return id_Employmentinfo;
	}

	public void setId_Employmentinfo(Long id_Employmentinfo) {
		this.id_Employmentinfo = id_Employmentinfo;
	}

	public String getEmployer() {
		return Employer;
	}

	public void setEmployer(String employer) {
		Employer = employer;
	}

	public String getEmploymentDuration() {
		return EmploymentDuration;
	}

	public void setEmploymentDuration(String employmentDuration) {
		EmploymentDuration = employmentDuration;
	}

	public String getYearlyIncome() {
		return YearlyIncome;
	}

	public void setYearlyIncome(String yearlyIncome) {
		YearlyIncome = yearlyIncome;
	}

	public String getEmploymentStatus() {
		return EmploymentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		EmploymentStatus = employmentStatus;
	}
	
	
}
