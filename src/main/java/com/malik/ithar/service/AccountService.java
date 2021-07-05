package com.malik.ithar.service;

import com.malik.ithar.model.Account;
import com.malik.ithar.model.User;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public void saveAccount(Account account) {
        System.out.println("DAO: Saving account:" + account.toString());
    }

    public void saveAccountRetry(Account account) {
        System.out.println("DAO: Saving account re-try:" + account.toString());
    }

}
