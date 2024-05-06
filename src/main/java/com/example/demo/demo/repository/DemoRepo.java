package com.example.demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.demo.domain.Login;



@Repository
public interface DemoRepo extends JpaRepository<Login,String>
{
Login findByUsernameAndPassword(String username, String password);

}
