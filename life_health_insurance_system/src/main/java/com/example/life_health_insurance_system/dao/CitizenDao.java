package com.example.life_health_insurance_system.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.life_health_insurance_system.dto.CitizenAppEntity;
import com.example.life_health_insurance_system.repo.CitizenAppRepository;

@Repository
public class CitizenDao {
	
	@Autowired
	CitizenAppRepository repository;

	public CitizenAppEntity saveCitizenAppEntity(CitizenAppEntity citizenAppEntity) {
		return repository.save(citizenAppEntity);
	}
}
