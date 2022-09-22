package com.h2dbtest.h2dbtest.service;

import com.h2dbtest.h2dbtest.model.User;
import com.h2dbtest.h2dbtest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUserById(Long id){
        return userRepository.findById(id).get();
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
