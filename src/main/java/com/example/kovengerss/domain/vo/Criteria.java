package com.example.kovengerss.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class Criteria {
    private Integer pageNum;
    private Integer amount;

    public Criteria() {
        this(1, 10);
    }
}

