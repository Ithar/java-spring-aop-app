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

    public Account getAccountByUser(User user, boolean isPersonalAccount) throws Exception {

        if (user != null && isPersonalAccount) {

            Account account = new Account(3489456L, 400);
            System.out.println("DAO: Getting account :" + account.toString());
            return account;
        }

        throw new Exception();
    }

}
