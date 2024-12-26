package com.practice.api.dto;

import com.practice.api.entity.Member;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MemberDto {

    private Long membNo;                       // CMT : 구성원 번호
    private String membNm;                     // CMT : 구성원명
    private String membTell;                   // CMT : 전화번호
    private String membMail;                   // CMT : 이메일
    private String membBirth;                  // CMT : 생년월일
    private Date membJoinDt;                   // CMT : 가입일자
    private String typeCd;                     // CMT : 구성원유형 코드
    private String posiCd;                     // CMT : 직위 코드
    private String grdCd;                      // CMT : 등급 코드
    private String deptCd;                     // CMT : 부서 코드
    private String statusCd;                   // CMT : 상태 코드


    //CMT : Entity를 DTO로 변환
    public void toDto(Member member) {
        this.membNo = member.getMembNo();
        this.membNm = member.getMembNm();
        this.membTell = member.getMembTell();
        this.membMail = member.getMembMail();
        this.membBirth = member.getMembBirth();
        this.membJoinDt = member.getMembJoinDt();
        this.typeCd = member.getTypeCd();
        this.posiCd = member.getPosiCd();
        this.grdCd = member.getGrdCd();
        this.deptCd = member.getDeptCd();
        this.statusCd = member.getStatusCd();
    }
    
}
