package com.malik.ithar.aspect.before;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspect {

    @Before("execution(public void com.malik.ithar.service.UserService.save*(*))")
    public void beforeSaveNewUserAdvice() {
        System.out.println("\n====== @Before 'user save' advice ======");
    }
}
