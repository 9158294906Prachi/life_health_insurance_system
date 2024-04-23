package com.example.life_health_insurance_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.life_health_insurance_system.dao.CitizenDao;
import com.example.life_health_insurance_system.dto.CitizenAppEntity;
import com.example.life_health_insurance_system.util.ResponceStructure;

@Service
public class CitizenService {
	
	@Autowired
	CitizenDao dao;
	
	public ResponseEntity<ResponceStructure<CitizenAppEntity>> saveCitizenAppEntity(CitizenAppEntity citizenAppEntity) {
		ResponceStructure<CitizenAppEntity> structure = new ResponceStructure<>();
		structure.setMessage("signup success");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(dao.saveCitizenAppEntity(citizenAppEntity));
		return new ResponseEntity<ResponceStructure<CitizenAppEntity>>(structure, HttpStatus.CREATED);
	}

}
