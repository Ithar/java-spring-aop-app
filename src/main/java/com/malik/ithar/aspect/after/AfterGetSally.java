package com.malik.ithar.aspect.after;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterGetSally {

    // Acts like finally, even if an exception is thrown

    @After("execution(com.malik.ithar.model.User getSally(*))")
    public void afterSallyNotFound() {
            System.out.println("\n====== @After 'Sally not found ' ======");
    }
}
