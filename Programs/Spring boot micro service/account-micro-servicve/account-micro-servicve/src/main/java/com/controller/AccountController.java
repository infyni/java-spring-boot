package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Account;
import com.service.AccountService;

@RestController
@RequestMapping("account")			// http://localhost:8282/account/*
public class AccountController {

	@Autowired
	AccountService accountService;
	
	
	//@RequestMapping(value = "create",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
	
	
	@GetMapping(value = "findBalance/{accno}")
	public String findBalance(@PathVariable("accno") int accno) {
		return accountService.findBalance(accno);
	}
	
	@GetMapping(value = "findAccountNumber/{emailid}")
	public int findAccountNumber(@PathVariable("emailid") String emailid) {
		return accountService.findAccountNumber(emailid);
	}
}
