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

import com.bank.loan.beans.DocumentRequirement;
import com.bank.loan.repositories.DocumentRequirementRepo;


@RestController
public class DocumentRequirementController {

	@Autowired
	private DocumentRequirementRepo documentrequirementrepo;
	
	@GetMapping("/documentrequirements")
	public List<DocumentRequirement> displayDocumentsRequirements(){
		return documentrequirementrepo.findAll();
	}
	@PostMapping("/adddocumentrequirement")
	public ResponseEntity<Object> createDocumentsRequirement(@RequestBody DocumentRequirement documentrequirement) {
		DocumentRequirement savedDocumentRequirement=documentrequirementrepo.save(documentrequirement);
		URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedDocumentRequirement.getId_DocumentRequirement()).toUri();
		
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/deletedocumentrequirement/{id}")
public void deleteDocumentsRequirement(@PathVariable Long id) {
		documentrequirementrepo.deleteById(id);
	}
	
	@PutMapping("/updatdocumentrequirement/{id}")
	public ResponseEntity<Object> updateDocumentsRequirement(@RequestBody DocumentRequirement documentrequirement, @PathVariable Long id){
		
		Optional<DocumentRequirement> DocumentsRequirementOptional= documentrequirementrepo.findById(id);
		if(!DocumentsRequirementOptional.isPresent())
			return ResponseEntity.notFound().build();
		documentrequirement.setId_DocumentRequirement(id);
		documentrequirementrepo.save(documentrequirement);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/finddocumentrequirement/{id}")
	public DocumentRequirement findDocumentsRequirement(@PathVariable long id) {
		return documentrequirementrepo.findById(id).orElse(null);
				
	}
}
