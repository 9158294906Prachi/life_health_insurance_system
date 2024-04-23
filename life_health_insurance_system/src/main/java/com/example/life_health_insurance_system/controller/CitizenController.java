package com.example.life_health_insurance_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.life_health_insurance_system.dto.CitizenAppEntity;
import com.example.life_health_insurance_system.service.CitizenService;
import com.example.life_health_insurance_system.util.ResponceStructure;

@RestController
public class CitizenController {
	
	@Autowired
	CitizenService service;
	
	@PostMapping("/signup")
	public ResponseEntity<ResponceStructure<CitizenAppEntity>> saveCitizenAppEntity(CitizenAppEntity citizenAppEntity) {
		return service.saveCitizenAppEntity(citizenAppEntity);
	}

}
