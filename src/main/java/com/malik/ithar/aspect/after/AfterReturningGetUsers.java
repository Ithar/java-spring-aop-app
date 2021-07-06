package com.malik.ithar.aspect.after;

import com.malik.ithar.model.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Aspect
@Component
public class AfterReturningGetUsers {

    @AfterReturning(
            pointcut = "execution(java.util.List getUsers() )",
            returning = "users")
    public void usersSortByAge(JoinPoint joinPoint, List<User> users) {

        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());

        users.clear();
        users.addAll(sortedUsers);
    }
}
