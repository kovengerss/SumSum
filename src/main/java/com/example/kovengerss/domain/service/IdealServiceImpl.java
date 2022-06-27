package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.IdealDAO;
import com.example.kovengerss.domain.vo.IdealVO;
import com.example.kovengerss.domain.vo.MessageVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("ideal") @Primary
public class IdealServiceImpl implements IdealService{
    private final IdealDAO idealDAO;
    @Override
    public List<IdealVO> getList() {
        return idealDAO.getList();
    }


    @Override
    public void idealInsert(IdealVO idealVO) {
        idealDAO.idealInsert(idealVO);
    }

    @Override
    public void idealDelete(IdealVO idealVO) {

    }

    @Override
    public boolean idealUpdate(IdealVO idealVO) {
        return idealDAO.idealUpdate(idealVO);
    }

    @Override
    public IdealVO idealSelect(Integer idealNum) {
        return idealDAO.idealSelect(idealNum);
    }

    @Override
    public String match(Integer idealNum){
        return idealDAO.match(idealNum);
    }

    @Override
    public void idealGetAge(IdealVO idealVO) {

    }

    @Override
    public void idealGetGender(IdealVO idealVO) {

    }

    @Override
    public void idealGetHobby(IdealVO idealVO) {

    }

    @Override
    public void idealGetResidence(IdealVO idealVO) {

    }

    @Override
    public void idealGetMbti(IdealVO idealVO) {

    }

    @Override
    public void idealGetIncome(IdealVO idealVO) {

    }

    @Override
    public void idealGetSelfIntroduce(IdealVO idealVO) {

    }

    @Override
    public void idealGetHouseExist(IdealVO idealVO) {

    }

    @Override
    public void idealGetUserNum(IdealVO idealVO) {

    }
}
