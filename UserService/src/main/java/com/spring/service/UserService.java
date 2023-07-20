package com.spring.service;

import com.spring.entitys.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(int userId);
}
