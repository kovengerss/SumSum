package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BlackListVO {
    private Integer blackListNum;
    private String blackListOk; //블랙리스트 유무
    private String blackListDate; 
    private Integer userNum;
}
