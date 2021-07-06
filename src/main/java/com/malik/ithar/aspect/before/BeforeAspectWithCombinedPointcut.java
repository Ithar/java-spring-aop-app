package com.malik.ithar.aspect.before;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspectWithCombinedPointcut {

    @Pointcut("execution(public void com.malik.ithar.service.AccountService.save*(*))")
    private void accountPointcut() {};

    @Pointcut("execution(public void com.malik.ithar.service.AccountService.saveAccountRetry(*))")
    private void accountPointcut2() {};

    @Before("accountPointcut() && !accountPointcut2()")
    public void beforeSaveAccountAdvice() {
        System.out.println("\n====== @Before 'account save' advice ======");
    }
}
