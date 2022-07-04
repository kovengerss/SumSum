package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.PointDAO;
import com.example.kovengerss.domain.dao.UserDAO;
import com.example.kovengerss.domain.vo.PointVO;
import com.example.kovengerss.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Qualifier("point") @Primary
public class PointServiceImpl implements PointService {
    private final PointDAO pointDAO;
    private final UserDAO userDAO;

    @Override
    public void pointInsert(Integer pointPrice) {

    }

    @Override
    public void pointSelect(PointVO pointVO) {

    }

    @Override
    public void pointGetPrice(PointVO pointVO) {

    }

    @Override
    public void pointGetUsePoint(PointVO pointVO) {

    }

    @Override
    public void pointGetRemainPoint(PointVO pointVO) {

    }

    @Override
    public void pointGetDate(PointVO pointVO) {

    }

    @Override
    public void pointGetWay(PointVO pointVO) {

    }

    @Override
    public void pointSuccess(Map<String, Object> map) {
        Integer userNum = (Integer) map.get("userNum");
        int point = (int) map.get("point");

        UserVO userVO = userDAO.findUserByUserNum(userNum);

        // 회원 테이블 포인트 업데이트
        boolean result = pointDAO.updateUserPoint(userNum, point);

        // pointWay = SAVE이면 충전
        String pointWay = "SAVE";
        int pointUse = 0;
        int pointRemain = userVO.getUserPoint() + point;

        // 포인트 사용내역 insert
        pointDAO.insertPointHistory(point, pointWay, pointUse, pointRemain, userNum, point);

        map.put("res", result);

    }

    @Override
    public List<Point> findAllByUserNumAndSave(Integer userNum) {
        return pointDAO.findAllByUserNumAndSave(userNum);
    }

    @Override
    public List<Point> findAllByUserNumAndUse(Integer userNum) {
        return pointDAO.findAllByUserNumAndUse(userNum);
    }
}
