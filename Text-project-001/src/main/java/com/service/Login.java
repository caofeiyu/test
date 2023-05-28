package com.service;

import com.pojo.User;

public interface Login {
    boolean login(String username, String password);
    boolean newUser(User user);
    User selectUser(String user);
}
