package com.example.life_health_insurance_system.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="CITIZENS_APP")
public class CitizenAppEntity {
    @Id
    @GeneratedValue
	private int appId;
	private String fname;
	private String email;
	private long mobileno;
	private String gender;
	private LocalDate dob;
	
}
