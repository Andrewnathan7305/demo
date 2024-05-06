package com.example.demo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.demo.domain.Login;
import com.example.demo.demo.repository.DemoRepo;

@Service
public class DemoService {
    @Autowired
    private DemoRepo rep;

    public Login log(String username, String password){
            Login user = rep.findByUsernameAndPassword(username, password);
            return user;
    }

}
