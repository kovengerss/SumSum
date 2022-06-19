package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.CoupleIdealDAO;
import com.example.kovengerss.domain.vo.CoupleIdealVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("board") @Primary
public class CoupleIdealServiceImpl implements CoupleIdealService{
    private final CoupleIdealDAO coupleIdealDAO;


    @Override
    public void coupleInsert(CoupleIdealVO coupleIdealVO) {

    }

    @Override
    public void coupleDelete(CoupleIdealVO coupleIdealVO) {

    }

    @Override
    public void coupleUpdate(CoupleIdealVO coupleIdealVO) {

    }

    @Override
    public void coupleSelect(CoupleIdealVO coupleIdealVO) {

    }

    @Override
    public void coupleGetAge(CoupleIdealVO coupleIdealVO) {

    }

    @Override
    public void coupleGetGender(CoupleIdealVO coupleIdealVO) {

    }

    @Override
    public void coupleGetHobby(CoupleIdealVO coupleIdealVO) {

    }

    @Override
    public void coupleGetResidence(CoupleIdealVO coupleIdealVO) {

    }

    @Override
    public void coupleGetMbti(CoupleIdealVO coupleIdealVO) {

    }

    @Override
    public void coupleGetSelfIntroduce(CoupleIdealVO coupleIdealVO) {

    }

    @Override
    public void coupleGetUserNum(CoupleIdealVO coupleIdealVO) {

    }
}
