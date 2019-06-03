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

import com.bank.loan.beans.EmploymentInfo;
import com.bank.loan.repositories.EmploymentInfoRepo;

@RestController
public class EmploymentInfoController {

	@Autowired
	private EmploymentInfoRepo employmentinforepo;
	
	@GetMapping("/employmentinfos")
	public List<EmploymentInfo> displayEmploymentInfos(){
		return employmentinforepo.findAll();
	}
	@PostMapping("/addemploymentinfo")
	public ResponseEntity<Object> createEmploymentInfo(@RequestBody EmploymentInfo employmentinfo) {
		EmploymentInfo savedEmploymentInfo=employmentinforepo.save(employmentinfo);
		URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedEmploymentInfo.getId_Employmentinfo()).toUri();
		
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/deleteemploymentinfo/{id}")
public void deleteEmploymentInfo(@PathVariable Long id) {
		employmentinforepo.deleteById(id);
	}
	
	@PutMapping("/updatemploymentinfo/{id}")
	public ResponseEntity<Object> updateEmploymentInfo(@RequestBody EmploymentInfo employmentinfo, @PathVariable Long id){
		
		Optional<EmploymentInfo> EmploymentInfoOptional= employmentinforepo.findById(id);
		if(!EmploymentInfoOptional.isPresent())
			return ResponseEntity.notFound().build();
		employmentinfo.setId_Employmentinfo(id);
		employmentinforepo.save(employmentinfo);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/findemploymentinfo/{id}")
	public EmploymentInfo findEmploymentInfo(@PathVariable long id) {
		return employmentinforepo.findById(id).orElse(null);
				
	}
}
