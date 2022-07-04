package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.PointVO;
import org.apache.ibatis.annotations.Mapper;

import java.awt.*;
import java.util.List;

@Mapper
public interface PointMapper {
    //포인트 결제
    public void insert(Integer pointPrice);
    //포인트 정보 전체 조회
    public PointVO select(PointVO pointVO);
    //포인트 결제한 금액 조회
    public Integer getPrice(PointVO pointVO);
    //포인트 사용 금액 조회
    public Integer getUsePoint(PointVO pointVO);
    //포인트 잔여 금액 조회
    public Integer getRemainPoint(PointVO pointVO);
    //포인트 사용 날짜 조회
    public Integer getDate(PointVO pointVO);
    //포인트 결제 수단 조회
    public String getWay(PointVO pointVO);

    int updateUserPoint(Integer userNum, int point);

    void insertPointHistory(int pointPrice, String pointWay, int pointUse, int pointRemain, Integer userNum, int point);

    List<Point> findAllByUserNumAndSave(Integer userNum);

    List<Point> findAllByUserNumAndUse(Integer userNum);
}
