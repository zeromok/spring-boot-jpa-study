package com.example.springbootjpastudy.domain;

import org.junit.jupiter.api.Test;


class MemberTest {

    @Test
    void test() {
        Member member = new Member("sample", "sample@naver.com");
        System.out.println("===>" + member);
    }
}