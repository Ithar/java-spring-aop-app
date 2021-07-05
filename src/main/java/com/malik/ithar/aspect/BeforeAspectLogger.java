package com.malik.ithar.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspectLogger {



    @Before("execution(public void saveNewUser(*))")
    public void beforeSaveNewUserAdvice() {
        System.out.println("\n====== @Before advice called ======");
    }

}
