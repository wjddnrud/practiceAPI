package com.practice.api.controller;

import com.practice.api.dto.MemberDto;
import com.practice.api.entity.Member;
import com.practice.api.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/member/")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/list")
    public ResponseEntity<?> findAll() {
        List<Member> memberList = memberService.findAll();
        return ResponseEntity.ok(memberList);
    }

    // 행 저장할때마다 전체 저장
    @PostMapping
    public ResponseEntity<?> upsert(List<MemberDto> memberDtoList) {
        List<Member> memberList = memberService.upsert(memberDtoList);
        return ResponseEntity.ok(memberList);
    }

    // 행삭제를 하게 되므로 여러개를 받아와서 지워주도록 -> 체크박스 선택된 값들만 골라서 제거하도록 구현하기
    @DeleteMapping
    public ResponseEntity<?> delete(List<Long> deleteIdxList) {
        String message = "삭제가 완료가 되었습니다.";
        return ResponseEntity.ok(message);
    }

}
