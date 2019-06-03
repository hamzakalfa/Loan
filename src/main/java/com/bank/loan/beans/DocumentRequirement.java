 package com.bank.loan.beans;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DocumentRequirement {

	@Id @GeneratedValue
	private Long id_DocumentRequirement;
	
	@Column(name = "docName", unique = false, nullable = false)
	private String docName;
	
	@Column(name = "docRequirement", unique = false, nullable = false)
	private String docRequirement;
	
	@Column(name = "docStatus", unique = false, nullable = false)
	private String docStatus;

	@OneToMany
	private List<LoanApplication> loanapplication;
	

	public List<LoanApplication> getLoanapplication() {
		return loanapplication;
	}

	public void setLoanapplication(List<LoanApplication> loanapplication) {
		this.loanapplication = loanapplication;
	}

	public DocumentRequirement() {
		super();
	}

	public Long getId_DocumentRequirement() {
		return id_DocumentRequirement;
	}

	public void setId_DocumentRequirement(Long id_DocumentRequirement) {
		this.id_DocumentRequirement = id_DocumentRequirement;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocRequirement() {
		return docRequirement;
	}

	public void setDocRequirement(String docRequirement) {
		this.docRequirement = docRequirement;
	}

	public String getDocStatus() {
		return docStatus;
	}

	public void setDocStatus(String docStatus) {
		this.docStatus = docStatus;
	}
	
	
}
