package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.PointVO;
import com.example.kovengerss.domain.vo.UserVO;
import com.example.kovengerss.mapper.PointMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PointDAO {
    private final PointMapper pointMapper;

    //포인트 결제
    public void pointInsert(Integer pointPrice){;}
    //포인트 정보 전체 조회
    public void pointSelect(PointVO pointVO){;}
    //포인트 결제한 금액 조회
    public void pointGetPrice(PointVO pointVO){;}
    //포인트 사용 금액 조회
    public void pointGetUsePoint(PointVO pointVO){;}
    //포인트 잔여 금액 조회
    public void pointGetRemainPoint(PointVO pointVO){;}
    //포인트 사용 날짜 조회
    public void pointGetDate(PointVO pointVO){;}
    //포인트 결제 수단 조회
    public void pointGetWay(PointVO pointVO){;}

    public boolean updateUserPoint(Integer userNum, int point) {

        return pointMapper.updateUserPoint(userNum, point) == 1;
    }
}
