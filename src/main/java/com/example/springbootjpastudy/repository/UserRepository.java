package com.example.springbootjpastudy.repository;

import com.example.springbootjpastudy.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Member, Long> { // <엔티티타입, pk 타입>

    List<Member> findByName(String name);
}
