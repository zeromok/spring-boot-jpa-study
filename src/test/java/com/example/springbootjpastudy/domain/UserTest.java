package com.example.springbootjpastudy.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class UserTest {

    @Test
    void test() {
        User user = new User();
        user.setName("name");

        System.out.println("===>" +  user);
    }
}