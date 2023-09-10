package com.example.booksoftware.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.booksoftware.entity.Users;

public interface UserRepo 
{
   public int loginValidation(String Username,String Password);
}
