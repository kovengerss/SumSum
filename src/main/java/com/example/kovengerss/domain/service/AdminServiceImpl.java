package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.AdminDAO;
import com.example.kovengerss.domain.vo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("admin") @Primary
public class AdminServiceImpl implements AdminService{
    private final AdminDAO adminDAO;

    @Override
    public AdminVO adminLogin(String adminId, String adminPw){
        return adminDAO.adminLogin(adminId, adminPw);
    }

    @Override
    public boolean remove(int boardNum) {
        return adminDAO.remove(boardNum);
    }

    @Override
    public String getUserId(int userNum){
        return adminDAO.getUserId(userNum);
    }

    @Override
    public List<BoardVO> getList(BoardVO boardVO,Criteria criteria) {
        return adminDAO.getList(boardVO, criteria);
    }
    @Override
    public List<BoardVO> getFieldAppil(BoardVO boardVO, Criteria3 criteria3) {
        return adminDAO.getFieldAppil(boardVO, criteria3);
    }
    @Override
    public List<BoardVO> getFieldBoard(BoardVO boardVO,Criteria2 criteria2) {
        return adminDAO.getFieldBoard(boardVO, criteria2);
    }
    @Override
    public List<BoardVO> getFieldReview(BoardVO boardVO,Criteria1 criteria1) {
        return adminDAO.getFieldReview(boardVO, criteria1);
    }

    @Override
    public int boardGetTotal(BoardVO boardVO) {return adminDAO.boardGetTotal(boardVO);}
    @Override
    public int boardGetTotalField(BoardVO boardVO) {return adminDAO.boardGetTotalField(boardVO);}

    @Override
    public int getCount(int boardNum) {
        return adminDAO.getCount(boardNum);
    }

    @Override
    public boolean deleteUser(int userNum) {
        return adminDAO.deleteUser(userNum);
    }
}
