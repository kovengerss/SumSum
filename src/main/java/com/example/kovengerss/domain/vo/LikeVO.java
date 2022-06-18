package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class LikeVO {
    private Integer likeNum;
    private Integer boardNum;
    private Integer userNum;
}
