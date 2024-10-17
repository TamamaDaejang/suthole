package com.example.demo.member.service;

import com.example.demo.member.controller.dto.JoinRequest;
import com.example.demo.member.repository.MemberRepository;
import com.example.demo.member.repository.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceimpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public String join(JoinRequest joinRequest){
        Member member = Member.builder()
                .id(joinRequest.getId())
                .password(joinRequest.getPassword())
                .name(joinRequest.getName())
                .phonNumber(joinRequest.getPhonNumber())
                .build();
        memberRepository.save(member);

        return "success";
    }
}
