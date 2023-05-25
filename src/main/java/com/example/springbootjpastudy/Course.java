package com.example.springbootjpastudy;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Course {

    private long id;
    private String name;
    private String author;

}
