package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entity.Gpay;
import com.repository.GpayRepository;

@Service
public class GpayService {

	@Autowired
	GpayRepository gpayRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	public String createGpayAccount(Gpay gpay) {	// emailid
		
		//int accno = restTemplate.getForObject("http://localhost:8282/account/findAccountNumber/"+gpay.getEmailid(), Integer.class);
		int accno = restTemplate.getForObject("http://ACCOUNT-MICRO-SERVICVE/account/findAccountNumber/"+gpay.getEmailid(), Integer.class);
		if(accno==-1) {
			return "Gpay account didn't create becuase bank account number not present";
		}else {
			gpay.setAccno(accno);
			gpayRepository.save(gpay);
			return "Gpay account created successfully";
		}
	}
	
	public String findAccountBalance(int gpayid) {
		Optional<Gpay> result = gpayRepository.findById(gpayid);
		if(result.isPresent()) {
			Gpay gpay= result.get();
			int accnumber = gpay.getAccno();
			//String output = restTemplate.getForObject("http://localhost:8282/account/findBalance/"+accnumber, String.class);
			String output = restTemplate.getForObject("http://ACCOUNT-MICRO-SERVICVE/account/findBalance/"+accnumber, String.class);
			return output;
		}else {
			return "Gpay account not present";
		}
	}
}






