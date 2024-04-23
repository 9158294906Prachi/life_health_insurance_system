package com.example.life_health_insurance_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.life_health_insurance_system.dto.CitizenAppEntity;

public interface CitizenAppRepository extends JpaRepository<CitizenAppEntity,Integer> {

}
