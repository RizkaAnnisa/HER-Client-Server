package com.rizka.userservice.service;

import com.rizka.userservice.dto.User;

import java.util.List;

public interface UserService {

  
    public User getUser(String id);

    public List<User> getAllUsers();

    public User deleteUser(String id);

    public User updateUser(User user);

    public void addUser(User user);



}
