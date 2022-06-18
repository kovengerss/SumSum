package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AdminVO {
    private String adminId;
    private String adminPw;
}
