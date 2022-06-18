package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ReplyVO {/*게시판 답글*/
    private Integer replyNum;
    private String replyContent;
    private String replyRegisterDate;
    private String replyUpdateDate;
    private Integer userNum;
    private Integer boardNum;
}
