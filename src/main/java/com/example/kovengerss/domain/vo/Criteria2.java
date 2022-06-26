package com.example.kovengerss.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class Criteria2 {
    private Integer pageNum;
    private Integer amount;

    public Criteria2() {
        this(1, 10);
    }
}

