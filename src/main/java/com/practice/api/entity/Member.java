package com.practice.api.entity;

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
    @Column
    private Long membNo;

    @Column(name = "MEMB_NM")
    private String membNm;

    @Column(name = "MEMB_TELL")
    private String membTell;

    @Column(name = "MEMB_MAIL")
    private String membMail;

    @Column(name = "MEMB BIRT")
    private String membBirt;

    @Column(name = "MEMB_JOIN_DT")
    private Date membJoinDt;

    @Column(name = "TYPE_CD")
    private String typeCd;

    @Column(name = "POSI_CD")
    private String posiCd;

    @Column(name = "GRD_CD")
    private String grdCd;

    @Column(name = "DEPT_CD")
    private String deptCd;

    @Column(name = "STATUS_CD")
    private String statusCd;


}

