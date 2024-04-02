package com.appreg.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.appreg.binding.CitizenApp;
import com.appreg.entity.CitizenAppEntity;
import com.appreg.repository.CitizenAppRepository;
import com.appreg.service.CitizenAppRegService;

@Service
public class CitizenServiceImpl implements CitizenAppRegService {
    @Autowired
	private CitizenAppRepository citizenapprepository;
	// ssn is a placeholder it is expecting dynamic value
	private static final String REST_URL = "http://ssawebapi-env.eba-k88bsahp.ap-south-1.elasticbeanstalk.com/ssn/{ssn}";

	@Override
	public String registerCitizenApp(CitizenApp citizenapp) {
		Long ssnno = citizenapp.getSsn();

		// we can't create object of web-client directly because it is interface so we
		// use method
		WebClient webclient = WebClient.create();

		// now send request to web-client by using get method and as input ssn-no
		String statename = webclient.get().uri(REST_URL, ssnno)// specify url to Hit
				.retrieve()// extract response
				.bodyToMono(String.class)// use for bind response in string class
				.block();// use for synchronous Purpose--WAIT FOR THE RESPONSE
		// for asynchronous we use subscribe();

		//Onboarding
		if ("RHODE ISLAND".equals(statename)) {
			
			CitizenAppEntity entity=new CitizenAppEntity();
			BeanUtils.copyProperties(citizenapp, entity);
			
			entity =citizenapprepository.save(entity);
			// application id is primary key
			return "Citizen App Created, App ID:"+entity.getAppId();
		}
		return "Citizen Not Belongs To RI.....!!!!";
	}

}
