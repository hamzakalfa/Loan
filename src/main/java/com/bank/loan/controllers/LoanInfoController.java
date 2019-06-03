package com.bank.loan.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bank.loan.beans.LoanInfo;
import com.bank.loan.repositories.LoanInfoRepo;

@RestController
public class LoanInfoController {

	@Autowired
	private LoanInfoRepo loaninforepo;
	
	@GetMapping("/loaninfos")
	public List<LoanInfo> displayLoanInfos(){
		return loaninforepo.findAll();
	}
	@PostMapping("/addloaninfo")
	public ResponseEntity<Object> createLoanInfo(@RequestBody LoanInfo LoanInfo) {
		LoanInfo savedLoanInfo=loaninforepo.save(LoanInfo);
		URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedLoanInfo.getId_loaninfo()).toUri();
		
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/deleteloaninfo/{id}")
public void deleteLoanInfo(@PathVariable Long id) {
		loaninforepo.deleteById(id);
	}
	
	@PutMapping("/updatloaninfo/{id}")
	public ResponseEntity<Object> updateLoanInfo(@RequestBody LoanInfo LoanInfo, @PathVariable Long id){
		
		Optional<LoanInfo> LoanInfoOptional= loaninforepo.findById(id);
		if(!LoanInfoOptional.isPresent())
			return ResponseEntity.notFound().build();
		LoanInfo.setId_loaninfo(id);
		loaninforepo.save(LoanInfo);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/findloaninfo/{id}")
	public LoanInfo findLoanInfo(@PathVariable long id) {
		return loaninforepo.findById(id).orElse(null);
				
	}
}
