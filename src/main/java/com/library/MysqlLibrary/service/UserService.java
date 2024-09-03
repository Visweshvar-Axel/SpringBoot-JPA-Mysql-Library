package com.library.MysqlLibrary.service;

import java.util.List;

import com.library.MysqlLibrary.model.User;

public interface UserService {

    List<User> getAll();

    User addUser(User user);

}