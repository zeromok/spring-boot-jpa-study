package com.example.springbootjpastudy.domain;


import lombok.*;

import java.time.LocalDateTime;

//@Getter
//@Setter
//@ToString
@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class User extends Object {

    @NonNull
    private String name;

    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
