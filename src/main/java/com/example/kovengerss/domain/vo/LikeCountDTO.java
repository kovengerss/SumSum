package com.example.kovengerss.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class LikeCountDTO {
    private Integer boardNum;
    private Integer l_boardNum;
}
