package com.Omar.VideoCall.Users;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.IntStream;

@Service
public class UserService {
    private static final List<User> USERS_LIST = new ArrayList<User>();

    public void registerUser(User user) {
//        user.setStatus("online");
        USERS_LIST.add(user);
    }

    public User Login(User user) {
        var user_index = IntStream.range(0, USERS_LIST.size())
                .filter(i -> USERS_LIST.get(i).getEmail().equals(user.getEmail()))
                .findAny()
                .orElseThrow(() -> new RuntimeException("User Not Found"));
        var current_user = USERS_LIST.get(user_index);
        if(! (current_user.getPassword().equals(user.getPassword()))) {
            throw new RuntimeException("Wrong Password");
        }
        current_user.setStatus("online");
        return current_user;
    }

    public void logoutUser(String email) {
        var user_index = IntStream.range(0, USERS_LIST.size())
                .filter(i -> USERS_LIST.get(i).getEmail().equals(email))
                .findAny()
                .orElseThrow(() -> new RuntimeException("User Not Found"));
        USERS_LIST.get(user_index).setStatus("offline");
    }

    public List<User> findAllUsers() {
        return USERS_LIST;
    }

}
