package com.example.demo.member.repository;

import com.example.demo.member.repository.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired private MemberRepository memberRepository;
    @Test
    public void crudTest() {
        Member member = Member.builder()
                .id("hbs")
                .name("한범수")
                .password("gksqjatn1")
                .phonNumber("01023739543")
                .build();

        //create tst
        memberRepository.save(member);

        //get test
        // Member foundMember = memberRepository.findById(1L).get();
    }


}
