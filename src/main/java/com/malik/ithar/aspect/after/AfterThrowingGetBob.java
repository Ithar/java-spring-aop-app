package com.malik.ithar.aspect.after;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingGetBob {

    @AfterThrowing("execution(com.malik.ithar.model.User getBob(*))")
    public void afterThrowingBobNotFound() {
            System.out.println("\n====== @AfterThrowing 'bob not found ' ======");
    }
}
