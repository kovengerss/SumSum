package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BoardVO {/*게시판*/
    private Integer boardNum;
    private String boardTitle;
    private String boardContent;
    private String boardField;
    private String boardRegisterDate;
    private String boardUpdateDate;
    private Integer userNum;
    private Integer warningCount;
    private Integer goodCount;
}
