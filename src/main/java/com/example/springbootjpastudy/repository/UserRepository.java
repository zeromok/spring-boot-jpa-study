package com.example.springbootjpastudy.repository;

import com.example.springbootjpastudy.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface UserRepository extends JpaRepository<Member, Long> { // <엔티티타입, pk 타입>

    List<Member> findByName(String name);

    @Query(value = "select * from Member limit 1;", nativeQuery = true)
    Map<String , Object> findRowRecord();
}
