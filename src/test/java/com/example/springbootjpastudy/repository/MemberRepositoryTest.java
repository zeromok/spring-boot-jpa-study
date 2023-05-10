package com.example.springbootjpastudy.repository;

import com.example.springbootjpastudy.domain.Member;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
class MemberRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Rollback(false)
    void crud() {
        userRepository.save(new Member("bbm", "bbm@naver.com"));

//        System.out.println("===> " + userRepository.findAll());
        userRepository.findAll().forEach(System.out::println);
    }

}