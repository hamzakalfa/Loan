package com.bank.loan.beans;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class LoanApplication {

	@Id @GeneratedValue
	private Long id_loanapplication;
	
	
	@ManyToOne
	private PersonalInfo personalinfo;
	
	@ManyToOne
	private LoanInfo loaninfo;
	
	@ManyToOne
	private EmploymentInfo employmentinfo;
	
	@ManyToMany  
	private List<Liability>  liabilities;
	
	
	
	@ManyToOne
	private CreditDecision creditdecision;
	
	@ManyToMany
	private List<DocumentRequirement> DocumentCheckList;

	public LoanApplication() {
		super();
	}

	public Long getId_loanapplication() {
		return id_loanapplication;
	}

	public void setId_loanapplication(Long id_loanapplication) {
		this.id_loanapplication = id_loanapplication;
	}

	public PersonalInfo getPersonalinfo() {
		return personalinfo;
	}

	public void setPersonalinfo(PersonalInfo personalinfo) {
		this.personalinfo = personalinfo;
	}

	public LoanInfo getLoaninfo() {
		return loaninfo;
	}

	public void setLoaninfo(LoanInfo loaninfo) {
		this.loaninfo = loaninfo;
	}

	public EmploymentInfo getEmploymentinfo() {
		return employmentinfo;
	}

	public void setEmploymentinfo(EmploymentInfo employmentinfo) {
		this.employmentinfo = employmentinfo;
	}

	public List<Liability> getLiabilities() {
		return liabilities;
	}

	public void setLiabilities(List<Liability> liabilities) {
		this.liabilities = liabilities;
	}

	public CreditDecision getCreditdecision() {
		return creditdecision;
	}

	public void setCreditdecision(CreditDecision creditdecision) {
		this.creditdecision = creditdecision;
	}

	public List<DocumentRequirement> getDocumentCheckList() {
		return DocumentCheckList;
	}

	public void setDocumentCheckList(List<DocumentRequirement> documentCheckList) {
		DocumentCheckList = documentCheckList;
	}
	
	
}
