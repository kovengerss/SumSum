package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BlackListVO {
    private Integer blackListNum;
    private String blackListOk;
    private String blackListDate;
    private Integer userNum;
}
