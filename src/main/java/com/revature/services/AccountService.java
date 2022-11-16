package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.models.Account;
import com.infosys.repositories.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	public Account createAccount(Account account) {
		account = accountRepository.saveAndFlush(account);
		return account;
	}
	
	public Account updateAccount(Account account) {
		account = accountRepository.save(account);
		return account;
	}
	
	public Account getAccount(Account account) {
		List<Account> accounts = accountRepository.findByEmailAndPassword(account.getEmail(), account.getPassword());
		if(accounts.size() ==0) return new Account(-1,"","",0);
		else return accounts.get(0);
	}
	
	public List<Account> getAllAccounts(){
		return accountRepository.findAll();
	}
}
