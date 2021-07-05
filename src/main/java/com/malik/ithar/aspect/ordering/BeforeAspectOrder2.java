package com.malik.ithar.aspect.ordering;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class BeforeAspectOrder2 {

    @Before("PointcutAspect.getUserPointcut()")
    public void getUserAdvice() {
        System.out.println(">>>>> 2 <<<<<< ");
    }

}
