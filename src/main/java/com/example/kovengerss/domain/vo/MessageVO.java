package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MessageVO {
    private Integer messageNum;
    private String messageTitle;
    private String messageContent;
    private String messageSendDate;
    private Integer userNum;
}
