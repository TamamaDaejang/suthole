package com.example.demo.member.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@NoArgsConstructor

public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idNumber;

    private String id;

    private String password;

    private String name;

    private String phonNumber;


}
