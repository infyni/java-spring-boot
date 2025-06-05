package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Gpay;
import com.service.GpayService;

@RestController
@RequestMapping("gpay")
public class GpayController {

	@Autowired
	GpayService gpayService;
	
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String gpayCreateAccount(@RequestBody Gpay gpay) {
		return gpayService.createGpayAccount(gpay);
	}
}
