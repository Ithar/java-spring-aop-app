package com.malik.ithar.main;

import com.malik.ithar.config.MainConfig;
import com.malik.ithar.model.Account;
import com.malik.ithar.model.User;
import com.malik.ithar.service.AccountService;
import com.malik.ithar.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemo {

    public static void main(String[] args) throws Exception {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MainConfig.class);

        UserService userService = context.getBean(UserService.class);
        AccountService accountService = context.getBean(AccountService.class);

        callBeforeAdvice(userService, accountService);

        callBeforeAdviceWithJoinPoints(accountService);
        System.out.println("\n\n");

        context.close();
    }

    private static void callBeforeAdvice(UserService userService, AccountService accountService) {

        User user = new User("Jane", "Doe", 50);
        userService.saveUser(user);

        Account account = new Account(346568L, 100);
        accountService.saveAccount(account);

        accountService.saveAccountRetry(account);

        userService.getUserById(10);
    }

    private static void callBeforeAdviceWithJoinPoints(AccountService accountService) throws Exception {

        User user = new User("Jane", "Doe", 50);
        accountService.getAccountByUser(user, true);

    }

}
