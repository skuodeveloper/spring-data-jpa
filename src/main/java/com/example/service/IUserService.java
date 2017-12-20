package com.example.service;

import com.example.domain.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    void saveUser(User book);

    User findOne(long id);

    void delete(long id);

    List<User> findByName(String name);

}
