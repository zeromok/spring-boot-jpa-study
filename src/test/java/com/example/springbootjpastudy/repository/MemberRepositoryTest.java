package com.example.springbootjpastudy.repository;

import com.example.springbootjpastudy.domain.Member;
import jakarta.transaction.Transactional;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.EndsWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;
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
//        Member member = userRepository.findById(10L).orElse(null);
//        System.out.println(member);

        // Flush : DB 반영시점을 조절해 준다.
//        Member member = userRepository.saveAndFlush(new Member("saveAndFlush", "test"));
//        userRepository.findAll().forEach(System.out::println);

//        long count = userRepository.count();
//        System.out.println("===> " + count);

        // count 를 사용해 확인한다.
//        boolean exist = userRepository.existsById(2L);
//        System.out.println("===> " + exist);

        // delete 할 때 먼저 select 로 확인 후 실행 -> 성능이슈 이유
//        userRepository.deleteById(2L);
//        userRepository.findAll().forEach(System.out::println);

//        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(2L, 4L)));
//        userRepository.findAll().forEach(System.out::println);

        // 성능이슈 해결법 1.
//        userRepository.deleteAllInBatch(userRepository.findAllById(Lists.newArrayList(2L, 4L)));
//        userRepository.findAll().forEach(System.out::println);

        // 성능이슈 해결법 2.
//        userRepository.deleteInBatch(userRepository.findAllById(Lists.newArrayList(2L, 4L)));
//        userRepository.findAll().forEach(System.out::println);

        // 페이징 관련 메서드
//        Page<Member> members = userRepository.findAll(PageRequest.of(1, 3));
//        System.out.println("===> " + members);
//        System.out.println("page : " + members);
//        System.out.println("totalElements : " + members.getTotalElements());
//        System.out.println("totalPages : " + members.getTotalPages());
//        System.out.println("numberOfElements : " + members.getNumberOfElements());
//        System.out.println("sort : " + members.getSort());
//        System.out.println("size : " + members.getSize());
//        members.getContent().forEach(System.out::println);

//        ExampleMatcher matcher = ExampleMatcher.matching()
//                .withIgnorePaths("name")
//                .withIgnorePaths("id")
//                .withIgnorePaths("createdAt")
//                .withIgnorePaths("updatedAt")
//                .withMatcher("email", endsWith());
//
//        Example<Member> example = Example.of(new Member("ma", "fast@gmail.com"), matcher);
//        userRepository.findAll(example).forEach(System.out::println);

    }

    @Test
    void select() {
        System.out.println(userRepository.findByName("Daniel"));
    }

}