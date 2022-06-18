package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class IdealVO {
    private Integer idealNum;
    private Integer age; //나이
    private String gender; //성별
    private String hobby; //취미
    private String residence;//거주지
    private Integer income; //수입
    private String selfIntroduce;//자기소개
    private String houseExist; //자가
    private Integer userNum;
}
