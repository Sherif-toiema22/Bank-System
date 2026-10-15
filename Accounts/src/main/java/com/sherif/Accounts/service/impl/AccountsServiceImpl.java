package com.sherif.Accounts.service.impl;

import com.sherif.Accounts.dto.CustomerDto;
import com.sherif.Accounts.repository.AccountsRepository;
import com.sherif.Accounts.repository.CustomerRepository;
import com.sherif.Accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {
    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;


    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
