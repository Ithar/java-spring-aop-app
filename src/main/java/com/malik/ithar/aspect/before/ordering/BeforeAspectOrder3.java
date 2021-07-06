package com.malik.ithar.aspect.before.ordering;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(3)
@Component
public class BeforeAspectOrder3 {

    @Before("PointcutAspect.getUserPointcut()")
    public void getUserAdvice() {
        System.out.println(">>>>> 3 <<<<<< ");
    }

}
