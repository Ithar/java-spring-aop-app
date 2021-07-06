package com.malik.ithar.service;

import com.malik.ithar.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<User> getUsers() {

        User user1 = new User("Jane", "Doe", 39);
        User user2 = new User("John", "Doe", 33);
        User user4 = new User("Mark", "Public", 46);
        User user3 = new User("Mary", "Public", 45);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        return users;
    }

    public User getBob(double id) {

        if (id == Math.random()) {
            System.out.println("Wow that was random ");
        }

        throw new RuntimeException("User not found");
    }

    public User getSally(double id) throws Exception {

        if (id == Math.random()) {
            System.out.println("Wow that was random ");
        }

        throw new Exception("User not found");
    }

}
