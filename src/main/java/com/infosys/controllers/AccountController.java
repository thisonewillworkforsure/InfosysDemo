package com.infosys.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.models.Account;
import com.infosys.services.AccountService;

@RestController
@RequestMapping("/accounts")
@CrossOrigin
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Account>> getAllAccounts(){
		return ResponseEntity.ok(accountService.getAllAccounts());
	}
	
	@PostMapping
	public ResponseEntity<Account> createAccount(@RequestBody Account account){
		return ResponseEntity.ok(accountService.createAccount(account));
	}
	
	@PutMapping
	public ResponseEntity<Account> updateAccount(@RequestBody Account account){
		return ResponseEntity.ok(accountService.updateAccount(account));
	}
	
	@GetMapping
	public ResponseEntity<Account> getAccount(@RequestBody Account account){
		return ResponseEntity.ok(accountService.getAccount(account));
	}
}
