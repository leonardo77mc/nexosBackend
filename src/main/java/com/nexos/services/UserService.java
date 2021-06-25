package com.nexos.services;

import com.nexos.models.User;

import java.util.List;

public interface UserService {

    public List<User> getAll();

    public User save(User user);

    public void delete(User user);

}
