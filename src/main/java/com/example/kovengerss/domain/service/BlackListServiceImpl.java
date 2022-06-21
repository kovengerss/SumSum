package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.BlackListVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("blackList") @Primary
public class BlackListServiceImpl implements BlackListService{
    @Override
    public void blackInsert(BlackListVO blackListVO) {

    }

    @Override
    public void blackDelete(BlackListVO blackListVO) {

    }

    @Override
    public List<BlackListVO> blackGetList() {
        return null;
    }

    @Override
    public void blackGetOne(Integer blackListNum) {

    }

    @Override
    public void blackGetTotal() {

    }
}
