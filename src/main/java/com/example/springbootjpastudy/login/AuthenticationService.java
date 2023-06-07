package com.example.springbootjpastudy.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String name, String password) {
        boolean isValidName = name.equals("test");
        boolean isValidPassword = password.equals("test1234");

        return isValidName && isValidPassword;
    }

} // end
