package com.example.springbootjpastudy.repository;

import com.example.springbootjpastudy.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JdbcCommandLineRunner implements CommandLineRunner {

    private final CourseRepository courseRepository;

    @Override
    public void run(String... args) throws Exception {
        courseRepository.create();

        courseRepository.insert(new Course(1, "NAME_1", "AUTHOR_1"));
        courseRepository.insert(new Course(2, "NAME_2", "AUTHOR_2"));
        courseRepository.insert(new Course(3, "NAME_3", "AUTHOR_3"));

        courseRepository.deleteById(3L);
    }
}
