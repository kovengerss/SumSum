package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CoupleIdealVO {
    private Integer idealNum;
    private Integer age; //나이
    private String gender; //성별
    private String hobby; //취미
    private String mbti;
    private String residence;//거주지
    private String selfIntroduce;//자기소개
    private Integer userNum;
}
