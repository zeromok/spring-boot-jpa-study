package com.example.springbootjpastudy.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@EqualsAndHashCode
@Getter
@NoArgsConstructor(force = true)
@Entity
@ToString
@Table(name = "member", indexes = {@Index(columnList = "name")}, uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class Member {

    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 디비에서 생성해준 값 쓸께(순차적 데이터 증가)
    private long id;

    @NonNull
//    @Column(nullable = false) // notNull - DB에 맡기자
    private String name;

//    @Column
    private String email;

    @Enumerated(value = EnumType.STRING) // default - EnumType.ORDINAL : DB에 인덱스가 들어간다. 인덱스값을 반환 잠재적인 버그 많음
    private Gender gender;

    public void setGender(Gender gender) {
        this.gender = gender;
    }

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
