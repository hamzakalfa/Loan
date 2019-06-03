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

import com.bank.loan.beans.Liability;
import com.bank.loan.repositories.LiabilityRepo;


@RestController
public class LiabilityController {

	@Autowired
	private LiabilityRepo liabilityrepo;
	
	@GetMapping("/liabilities")
	public List<Liability> displayLiabilitys(){
		return liabilityrepo.findAll();
	}
	@PostMapping("/addliability")
	public ResponseEntity<Object> createLiability(@RequestBody Liability Liability) {
		Liability savedLiability=liabilityrepo.save(Liability);
		URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedLiability.getId_Liability()).toUri();
		
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/deleteliability/{id}")
public void deleteLiability(@PathVariable Long id) {
		liabilityrepo.deleteById(id);
	}
	
	@PutMapping("/updatliability/{id}")
	public ResponseEntity<Object> updateLiability(@RequestBody Liability Liability, @PathVariable Long id){
		
		Optional<Liability> LiabilityOptional= liabilityrepo.findById(id);
		if(!LiabilityOptional.isPresent())
			return ResponseEntity.notFound().build();
		Liability.setId_Liability(id);
		liabilityrepo.save(Liability);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/findliability/{id}")
	public Liability findLiability(@PathVariable long id) {
		return liabilityrepo.findById(id).orElse(null);
				
	}
}
