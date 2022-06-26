package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.AdminDAO;
import com.example.kovengerss.domain.vo.AdminVO;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.domain.vo.UserVO;
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
    public List<BoardVO> getList(Criteria criteria) {
        return adminDAO.getList(criteria);
    }

    @Override
    public int getCount(int boardNum) {
        return adminDAO.getCount(boardNum);
    }

    @Override
    public boolean deleteUser(int userNum) {
        return adminDAO.deleteUser(userNum);
    }
}
