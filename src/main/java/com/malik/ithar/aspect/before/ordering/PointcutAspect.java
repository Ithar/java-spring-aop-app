package com.malik.ithar.aspect.before.ordering;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class PointcutAspect {

    @Pointcut("execution(com.malik.ithar.model.User getUserById(*))")
    public static void getUserPointcut() {};



}
