package com.bank.loan.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PersonalInfo {

	@Id @GeneratedValue
	private Long id_personalinfo;
	
	@Column(name = "FirstLastName", unique = false, nullable = false)
	private String FirstLastName;
	
	@Column(name = "IDNumber", unique = false, nullable = false)
	private String IDNumber;
	
	@Column(name = "AddressStreet", unique = false, nullable = false)
	private String AddressStreet;
	
	@Column(name = "AdressStreet2", unique = false, nullable = false)
	private String AdressStreet2;
	
	@Column(name = "AddressZip", unique = false, nullable = false)
	private String AddressZip;
	
	@Column(name = "AdressCity", unique = false, nullable = false)
	private String AdressCity;
	
	@Column(name = "MaritalStatus", unique = false, nullable = false)
	private String MaritalStatus;
	
	@Column(name = "CustomerType", unique = false, nullable = false)
	private String CustomerType;
	
	@Column(name = "HousingStatus", unique = false, nullable = false)
	private String HousingStatus;
	
	@Column(name = "SupportedPersons", unique = false, nullable = false)
	private Integer SupportedPersons; 
	
	@Column(name = "Age", unique = false, nullable = false)
	private Integer Age;
	
	@OneToMany
	private List<LoanApplication> loanapplication;
	
	
	public List<LoanApplication> getLoanapplication() {
		return loanapplication;
	}


	public void setLoanapplication(List<LoanApplication> loanapplication) {
		this.loanapplication = loanapplication;
	}


	public PersonalInfo() {
		super();
	}
	  

	public Long getId_personalinfo() {
		return id_personalinfo;
	}

	public void setId_personalinfo(Long id_personalinfo) {
		this.id_personalinfo = id_personalinfo;
	}

	public String getFirstLastName() {
		return FirstLastName;
	}

	public void setFirstLastName(String firstLastName) {
		FirstLastName = firstLastName;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getAddressStreet() {
		return AddressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		AddressStreet = addressStreet;
	}

	public String getAdressStreet2() {
		return AdressStreet2;
	}

	public void setAdressStreet2(String adressStreet2) {
		AdressStreet2 = adressStreet2;
	}

	public String getAddressZip() {
		return AddressZip;
	}

	public void setAddressZip(String addressZip) {
		AddressZip = addressZip;
	}

	public String getAdressCity() {
		return AdressCity;
	}

	public void setAdressCity(String adressCity) {
		AdressCity = adressCity;
	}

	public String getMaritalStatus() {
		return MaritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}

	public String getCustomerType() {
		return CustomerType;
	}

	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}

	public String getHousingStatus() {
		return HousingStatus;
	}

	public void setHousingStatus(String housingStatus) {
		HousingStatus = housingStatus;
	}

	public Integer getSupportedPersons() {
		return SupportedPersons;
	}

	public void setSupportedPersons(Integer supportedPersons) {
		SupportedPersons = supportedPersons;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer age) {
		Age = age;
	}

	
	
	
	
}
