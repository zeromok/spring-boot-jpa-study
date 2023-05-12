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
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 생성된 값 쓸께(순차적 데이터 증가)
    private long id;

    @NonNull
//    @Column(nullable = false) // notNull
    private String name;

//    @Column
    private String email;

    private String gender;

    @Column(updatable = false) // update 시 저장 안함
    private LocalDateTime createdAt;

    @Column(insertable = false) // insert 시 저장 안힘
    private LocalDateTime updatedAt;

    @Transient // 이 객체에서만 사용하는 필드 DB 와는 상관 없는...
    private String  objField;

    public Member(@NonNull String name, String email) {
        this.name = name;
        this.email = email;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
