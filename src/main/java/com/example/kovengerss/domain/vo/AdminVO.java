package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AdminVO {/*관리자*/
    private String adminId;
    private String adminPw;
}
