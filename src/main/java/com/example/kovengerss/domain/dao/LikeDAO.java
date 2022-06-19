package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.LikeVO;
import com.example.kovengerss.mapper.LikeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LikeDAO {
    private final LikeMapper likeMapper;
    //좋아요 갯수
    public void likeCount(LikeVO likeVO){;}
}
