package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.PointVO;
import org.springframework.stereotype.Service;

@Service
public interface PointService {
    //포인트 결제
    public void pointInsert(Integer pointPrice);
    //포인트 정보 전체 조회
    public void pointSelect(PointVO pointVO);
    //포인트 결제한 금액 조회
    public void pointGetPrice(PointVO pointVO);
    //포인트 사용 금액 조회
    public void pointGetUsePoint(PointVO pointVO);
    //포인트 잔여 금액 조회
    public void pointGetRemainPoint(PointVO pointVO);
    //포인트 사용 날짜 조회
    public void pointGetDate(PointVO pointVO);
    //포인트 결제 수단 조회
    public void pointGetWay(PointVO pointVO);
}
