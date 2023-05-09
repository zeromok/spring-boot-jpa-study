package com.example.springbootjpastudy.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
public class User extends Object {


    @NonNull
    private String name;

    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
