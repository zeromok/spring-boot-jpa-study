package com.example.springbootjpastudy.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Entity
public class Member {

    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 순차적 데이터 증가
    private long id;

    @NonNull
    @Column
    private String name;

    @Column
    private String email;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    public Member(@NonNull String name, String email) {
        this.name = name;
        this.email = email;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
