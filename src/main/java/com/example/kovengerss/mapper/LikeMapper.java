package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.LikeVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LikeMapper {
    //좋아요 갯수
    public Integer likeCount(LikeVO likeVO);

}
