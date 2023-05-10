package com.example.springbootjpastudy.repository;

import com.example.springbootjpastudy.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { // <엔티티타입, pk 타입>

}
