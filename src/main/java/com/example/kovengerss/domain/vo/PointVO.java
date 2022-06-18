package com.example.kovengerss.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PointVO {/*포인트*/
    private Integer pointNum; //nextval()
    private Integer pointPrice;//결제 가격
    private String pointWay;//결제 수단
    private Integer pointUse;//사용포인트
    private Integer pointRemain;//잔여포인트
    private String pointDate;//결제 날짜
    private Integer userNum;
}
