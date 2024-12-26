package com.practice.api.controller;

import com.practice.api.entity.Member;
import com.practice.api.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Log4j2
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/list")
    public ResponseEntity<?> findAll() {
        log.info("=== list");
        List<Member> memberList = memberService.findAll();
        return ResponseEntity.ok(memberList);
    }

}
