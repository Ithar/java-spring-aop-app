package com.malik.ithar.service;

import com.malik.ithar.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void saveUser(User user) {
        System.out.println("DAO: Saving user:" + user.toString());
    }

    public User getUserById(int id) {
        User user = new User("Jane", "Doe", id);
        System.out.println("DAO: Getting user : " + user.toString());
        return user;
    }

}
