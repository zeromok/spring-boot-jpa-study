package com.example.springbootjpastudy.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode
@Getter
@NoArgsConstructor(force = true)
@Entity
@ToString
public class Member {

    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 순차적 데이터 증가
    private long id;

    @NonNull
//    @Column
    private String name;

//    @Column
    private String email;

//    @Column(name = "created_at")
    private LocalDateTime createdAt;

//    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Member(@NonNull String name, String email) {
        this.name = name;
        this.email = email;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
