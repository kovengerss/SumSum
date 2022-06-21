package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AnswerVO {/*쪽지 답장*/
    private Integer answerNum;
    private Integer userNum;
    private Integer messageNum;
    private String answerTitle;
    private String answerContent;
    private String answerSendDate;

}