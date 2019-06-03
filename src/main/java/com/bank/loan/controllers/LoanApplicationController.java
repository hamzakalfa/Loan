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

import com.bank.loan.beans.LoanApplication;
import com.bank.loan.repositories.LoanApplicationRepo;


@RestController
public class LoanApplicationController {

	@Autowired
	private LoanApplicationRepo loanapplicationrepo;
	
	@GetMapping("/liabilities")
	public List<LoanApplication> displayloanApplications(){
		return loanapplicationrepo.findAll();
	}
	@PostMapping("/addloanApplication")
	public ResponseEntity<Object> createloanApplication(@RequestBody LoanApplication loanApplication) {
		LoanApplication savedloanApplication=loanapplicationrepo.save(loanApplication);
		URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedloanApplication.getId_loanapplication()).toUri();
		
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/deleteloanApplication/{id}")
public void deleteloanApplication(@PathVariable Long id) {
		loanapplicationrepo.deleteById(id);
	}
	
	@PutMapping("/updatloanApplication/{id}")
	public ResponseEntity<Object> updateloanApplication(@RequestBody LoanApplication loanApplication, @PathVariable Long id){
		
		Optional<LoanApplication> loanApplicationOptional= loanapplicationrepo.findById(id);
		if(!loanApplicationOptional.isPresent())
			return ResponseEntity.notFound().build();
		loanApplication.setId_loanapplication(id);
		loanapplicationrepo.save(loanApplication);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/findloanApplication/{id}")
	public LoanApplication findloanApplication(@PathVariable long id) {
		return loanapplicationrepo.findById(id).orElse(null);
				
	}
	
}
