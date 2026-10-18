package com.sherif.Accounts.service.impl;

import com.sherif.Accounts.constant.AccountsConstants;
import com.sherif.Accounts.dto.CustomerDto;
import com.sherif.Accounts.entity.Accounts;
import com.sherif.Accounts.entity.Customer;
import com.sherif.Accounts.exception.CustomerAlreadyExistsException;
import com.sherif.Accounts.mapper.CustomerMapper;
import com.sherif.Accounts.repository.AccountsRepository;
import com.sherif.Accounts.repository.CustomerRepository;
import com.sherif.Accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {
    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;


    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer= CustomerMapper.mapToCustomer(customerDto,new Customer());
        Optional<Customer> byMobileNumber = customerRepository.findByMobileNumber(customerDto.getMobileNumber());
        if (byMobileNumber.isPresent())
            throw new CustomerAlreadyExistsException("Customer already with given mobile number"+customerDto.getMobileNumber());
        Customer customer1=customerRepository.save(customer);
        accountsRepository.save(createNewAccount(customer1));

    }
    /**
     * @param customer - Customer Object
     * @return the new account details
     */
    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }
}
