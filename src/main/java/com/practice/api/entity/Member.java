package com.practice.api.entity;

import com.practice.api.dto.MemberDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "edu_memb_base_02")
@Getter
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MEMB_NO")
    private Long membNo;                       // CMT : 구성원 번호

    @Column(name = "MEMB_NM", length = 10)
    private String membNm;                     // CMT : 구성원명

    @Column(name = "MEMB_TELL", length = 13)
    private String membTell;                   // CMT : 전화번호

    @Column(name = "MEMB_MAIL", length =100)
    private String membMail;                   // CMT : 이메일

    @Column(name = "MEMB_BIRTH", length = 10)
    private String membBirth;                  // CMT : 생년월일

    @Column(name = "MEMB_JOIN_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date membJoinDt;                   // CMT : 가입일자

    @Column(name = "TYPE_CD", length = 2)
    private String typeCd;                     // CMT : 구성원유형 코드

    @Column(name = "POSI_CD", length = 2)
    private String posiCd;                     // CMT : 직위 코드

    @Column(name = "GRD_CD", length = 2)
    private String grdCd;                      // CMT : 등급 코드

    @Column(name = "DEPT_CD", length = 2)
    private String deptCd;                     // CMT : 부서 코드

    @Column(name = "STATUS_CD", length = 2)
    private String statusCd;                   // CMT : 상태 코드


    //CMT : DTO를 Entity로 변환
    public void toDto(MemberDto memberDto) {
        this.membNo = memberDto.getMembNo();
        this.membNm = memberDto.getMembNm();
        this.membTell = memberDto.getMembTell();
        this.membMail = memberDto.getMembMail();
        this.membBirth = memberDto.getMembBirth();
        this.membJoinDt = memberDto.getMembJoinDt();
        this.typeCd = memberDto.getTypeCd();
        this.posiCd = memberDto.getPosiCd();
        this.grdCd = memberDto.getGrdCd();
        this.deptCd = memberDto.getDeptCd();
        this.statusCd = memberDto.getStatusCd();
    }

}

