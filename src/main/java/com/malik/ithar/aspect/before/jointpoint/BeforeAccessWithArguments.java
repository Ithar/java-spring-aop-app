package com.malik.ithar.aspect.before.jointpoint;

import com.malik.ithar.model.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAccessWithArguments {

    @Pointcut("execution(public com.malik.ithar.model.Account com.malik.ithar.service.AccountService." +
            "getAccountByUser(com.malik.ithar.model.User, boolean))")
    public void accountByUser() {};

    @Before("accountByUser()")
    public void something(JoinPoint joinPoint) {

        Object[] args = joinPoint.getArgs();
        User user = (User) args[0];
        boolean isPersonalAccount = (boolean) args[1];

        System.out.println("\n====== @Before 'join point ' advice [[["+ user.toString()+ " - "+isPersonalAccount +" ]]] ======");
    }

}
