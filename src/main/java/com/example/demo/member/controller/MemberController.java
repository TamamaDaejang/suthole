package com.example.demo.member.controller;

import com.example.demo.member.controller.dto.JoinRequest;
import com.example.demo.member.repository.entity.Member;
import com.example.demo.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/RegistrationComplete")
    public String getRegistrationComplete(){
        return "회원가입 완료";
    }

    @PostMapping("/join")
    public String join (@RequestBody JoinRequest joinRequest){

        String result = memberService.join(joinRequest);

        if("success".equalsIgnoreCase(result)){
            return "success";
        }
        else {
            return "fail";
        }

    }





}
