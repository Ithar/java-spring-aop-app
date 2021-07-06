package com.malik.ithar.aspect.around;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundReBalanceAccounts {

    // Pre/Post processing & capturing exceptions

    @Around("execution(boolean reBalanceAccounts())")
    private Object aroundReBalanceAccounts(ProceedingJoinPoint preJointPoint ) throws Throwable {

        long begin = System.currentTimeMillis();

        Object result = null;

        try {
            result = preJointPoint.proceed();

        } catch (Exception e) {
            System.out.println("\n====== @Around re-balance account exception caught:");
            result = true;
        }

        long end = System.currentTimeMillis();

        long duration = end - begin;

        System.out.println("\n====== @Around re-balance account: " + duration / 1000 + " ======");

        return result;
    }

}
