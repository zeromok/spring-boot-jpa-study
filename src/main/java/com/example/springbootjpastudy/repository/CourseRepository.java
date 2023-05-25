package com.example.springbootjpastudy.repository;

import com.example.springbootjpastudy.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CourseRepository {

    private final JdbcTemplate jdbcTemplate;

    private static String CREATE_QUERY =
            """
            create table course (
                id bigint not null, 
                name varchar(255) not null,
                author varchar(255) not null,
                primary key (id)
            );
            """;
    private static String INSERT_QUERY =
            """
            insert into course (id, name, author)
            values(?, ?, ?);
            """;

    private static String DELETE_QUERY =
            """
            delete from course where id = ?;
            """;

    public void create() {
        jdbcTemplate.execute(CREATE_QUERY);
    }

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(Long id) {
        jdbcTemplate.update(DELETE_QUERY, id);
    }

}
