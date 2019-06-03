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

import com.bank.loan.beans.PersonalInfo;
import com.bank.loan.repositories.PersonalInfoRepo;


@RestController
public class PersonalInfoController {

	@Autowired
	private PersonalInfoRepo personalinforepo;
	
	@GetMapping("/personalinfos")
	public List<PersonalInfo> displayPersonalInfos(){
		return personalinforepo.findAll();
	}
	@PostMapping("/addPersonalInfo")
	public ResponseEntity<Object> createPersonalInfo(@RequestBody PersonalInfo PersonalInfo) {
		PersonalInfo savedPersonalInfo=personalinforepo.save(PersonalInfo);
		URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedPersonalInfo.getId_personalinfo()).toUri();
		
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/deletePersonalInfo/{id}")
public void deletePersonalInfo(@PathVariable Long id) {
		personalinforepo.deleteById(id);
	}
	
	@PutMapping("/updatPersonalInfo/{id}")
	public ResponseEntity<Object> updatePersonalInfo(@RequestBody PersonalInfo PersonalInfo, @PathVariable Long id){
		
		Optional<PersonalInfo> PersonalInfoOptional= personalinforepo.findById(id);
		if(!PersonalInfoOptional.isPresent())
			return ResponseEntity.notFound().build();
		PersonalInfo.setId_personalinfo(id);
		personalinforepo.save(PersonalInfo);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/findPersonalInfo/{id}")
	public PersonalInfo findPersonalInfo(@PathVariable long id) {
		return personalinforepo.findById(id).orElse(null);
				
	}
}
