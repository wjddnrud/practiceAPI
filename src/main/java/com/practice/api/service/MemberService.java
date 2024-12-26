package com.practice.api.service;

import com.practice.api.entity.Member;
import com.practice.api.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
