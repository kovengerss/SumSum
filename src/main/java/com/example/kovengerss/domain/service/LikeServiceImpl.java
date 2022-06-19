package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.LikeDAO;
import com.example.kovengerss.domain.vo.LikeVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("like") @Primary
public class LikeServiceImpl implements LikeService{
    private final LikeDAO likeDAO;


    @Override
    public void likeSelect(LikeVO likeVO) {

    }

    @Override
    public void likeInsert(LikeVO likeVO) {

    }

    @Override
    public void likeDelete(LikeVO likeVO) {

    }

    @Override
    public void likeGetBoardNum(LikeVO likeVO) {

    }
}
