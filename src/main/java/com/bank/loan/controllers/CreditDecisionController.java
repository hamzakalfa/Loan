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

import com.bank.loan.beans.CreditDecision;
import com.bank.loan.repositories.CreditDecisionRepo;



@RestController
public class CreditDecisionController{

	@Autowired
	private CreditDecisionRepo creditdecisionrepo;
	
	@GetMapping("/creditdecisions")
	public List<CreditDecision> displayCreditDecisions(){
		return creditdecisionrepo.findAll();
	}
	@PostMapping("/addcreditdecision")
	public ResponseEntity<Object> createCreditDecision(@RequestBody CreditDecision CreditDecision) {
		CreditDecision savedCreditDecision=creditdecisionrepo.save(CreditDecision);
		URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedCreditDecision.getId_CreditDecision()).toUri();
		
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/deletedecision/{id}")
public void deleteCreditDecision(@PathVariable Long id) {
		creditdecisionrepo.deleteById(id);
	}
	
	@PutMapping("/updatcreditdecision/{id}")
	public ResponseEntity<Object> updateCreditDecision(@RequestBody CreditDecision CreditDecision, @PathVariable Long id){
		
		Optional<CreditDecision> CreditDecisionOptional= creditdecisionrepo.findById(id);
		if(!CreditDecisionOptional.isPresent())
			return ResponseEntity.notFound().build();
		CreditDecision.setId_CreditDecision(id);
		creditdecisionrepo.save(CreditDecision);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/findcreditdecision/{id}")
	public CreditDecision findCreditDecision(@PathVariable long id) {
		return creditdecisionrepo.findById(id).orElse(null);
				
	}
}
