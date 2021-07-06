package com.malik.ithar.service;

import com.malik.ithar.model.Account;
import com.malik.ithar.model.User;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

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
            System.out.println("DAO: Getting account :" + account);
            return account;
        }

        throw new Exception();
    }

    public boolean reBalanceAccounts() {

        int target = 3;

        Random random = new Random();

        int num1 = random.nextInt((3 - 1) + 1) + 1;

        try {
            TimeUnit.SECONDS.sleep(num1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (num1 != target) {
            throw new RuntimeException("Capture and don't throw me");
        }

        return true;
    }
}
