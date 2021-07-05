package com.malik.ithar.service;

import com.malik.ithar.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void saveNewUser(User user) {
        System.out.println("DAO: Saving user:" + user.toString());
    }

    public User getUserById(int id) {
        return new User("Jane", "Doe", id);
    }

}
