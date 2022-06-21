package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CoupleIdealVO {
    private Integer coupleIdealNum;
    private Integer coupleAge; //나이//
    private String coupleGender; //성별//
    private String coupleHobby; //취미//
    private String coupleMbti;//
    private String coupleResidence;//거주지//
    private String coupleSelfIntroduce;//자기소개
    //이상형
    private String coupleIdealContent;
    //흡연
    private String coupleSmoke;
    //직업
    private String coupleJob;
    //
    private Integer userNum;
}