package com.homestudy.member.service;

import com.homestudy.member.dto.MemberDTO;
import com.homestudy.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {

        // repository의 save메서드 호출 (조건. entity객체를 넘겨줘야 함)

    }
}
