package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class LikeVO {/*좋아요*/
    private Integer likeNum;
    private Integer boardNum;
    private Integer userNum;
    private Integer warningCount;
}
