package com.example.springbootjpastudy.repository;

import com.example.springbootjpastudy.domain.Member;
import jakarta.transaction.Transactional;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;
import java.util.Optional;


@SpringBootTest
class MemberRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud() {
//        userRepository.save(new Member()); // 이 로직 먼저 적용 후 data.sql 적용

//        System.out.println("===> " + userRepository.findAll());
//        userRepository.findAll().forEach(System.out::println);
//        userRepository.findAll(Sort.by(Sort.Direction.DESC, "name")).forEach(System.out::println);

        // Lists. : test 환경에서만 제공되는 객체
//        userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L)).forEach(System.out::println);

        // 아래의 proxy 오류는 @Transactional 로 잡음
//        Member member = userRepository.getReferenceById(1L);
//        System.out.println(member);

        // 없으면 null 반환해
        Member member = userRepository.findById(10L).orElse(null);
        System.out.println(member);


    }

}