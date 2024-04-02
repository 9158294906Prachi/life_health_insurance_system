package com.appreg.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties.Http;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appreg.binding.CitizenApp;
import com.appreg.service.CitizenAppRegService;

@RestController
public class CitizenRestController {
	
    @Autowired
	private CitizenAppRegService service;
	
    @PostMapping("/register")
	public ResponseEntity<String> registercitizen(@RequestBody CitizenApp citizenapp)
	{
    	String response=service.registerCitizenApp(citizenapp);
    	
    	return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
}
