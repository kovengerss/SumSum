package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.AdminDAO;
import com.example.kovengerss.domain.vo.AdminVO;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("admin") @Primary
public class AdminServiceImpl implements AdminService{
    private final AdminDAO adminDAO;

    @Override
    public void adminInsert(AdminVO adminVO) {

    }

    @Override
    public void adminDeleteBoard(BoardVO boardVO) {

    }

    @Override
    public void adminUpdateBoard(BoardVO boardVO) {

    }

    @Override
    public void adminGetWarningCount(BoardVO boardVO) {

    }

    @Override
    public void adminDeleteUser(UserVO userVO) {

    }
}
