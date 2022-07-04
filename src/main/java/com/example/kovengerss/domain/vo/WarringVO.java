package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class WarringVO {
    private Integer warringNum;
    private Integer boardNum;
    private Integer userNum;
}
