package blogpost.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogpost.project.models.Account;
import blogpost.project.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	AccountRepository accountRepository;
	
	public Account saveAccount(Account account)
	{
		return accountRepository.save(account);
	}

}
