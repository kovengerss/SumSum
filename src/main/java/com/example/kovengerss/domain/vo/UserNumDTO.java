package com.example.kovengerss.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class UserNumDTO {
    private Integer U_userNum;
    private Integer R_userNum;
    private String userName;


    public UserNumDTO(Integer U_userNum,Integer R_userNum){
        UserVO userVO = new UserVO();
        ReplyVO replyVO = new ReplyVO();
        this.U_userNum = userVO.getUserNum();
        this.R_userNum = replyVO.getUserNum();
        this.userName = userVO.getUserName();
    }

}
