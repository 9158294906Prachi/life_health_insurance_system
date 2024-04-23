package com.example.life_health_insurance_system.util;

import lombok.Data;

@Data
public class ResponceStructure<T> {
	
	private String message;
	private int status;
	private T data;

}