package com.homestudy.member.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// Database의 테이블 역할을 함.
@Entity
@Setter
@Getter
@Table(name = "member_table")
public class MemberEntity {

    @Id // pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(unique = true) // unique 제약조건 추가
    private String memberEmail;

    @Column
    private String memberPassword;

    @Column
    private String memberName;


}
