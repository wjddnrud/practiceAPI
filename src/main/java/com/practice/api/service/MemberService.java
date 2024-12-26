package com.practice.api.service;

import com.practice.api.dto.MemberDto;
import com.practice.api.entity.Member;
import com.practice.api.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    /**
     * CMT : 구성원 전체 조회
     * @return
     */
    public List<Member> findAll() {
        return memberRepository.findAll();
    }
    
    /**
     * CMT : 구성원 등록 및 수정
     * @param memberList
     * @return
     */
//    public List<Member> upsert(List<MemberDto> memberDtoList) {
//        // List<Member> memberList = memberDtoList.stream().toList();
//        return memberRepository.saveAll(memberList);
//    }

    /**
     * CMT : 구성원 삭제
     * @param deleteIdxList
     */
    public void delete(List<Long> deleteIdxList) {
        List<Member> memberEntityList = memberRepository.findAllById(deleteIdxList);
        memberRepository.deleteAllInBatch(memberEntityList);
    }
}
