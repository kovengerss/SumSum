package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.LikeVO;
import org.springframework.stereotype.Service;

@Service
public interface LikeService {
    //좋아요 갯수
    public Integer likeCount(LikeVO likeVO);
}
