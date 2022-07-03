package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.LikeVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LikeMapper {
//  게시판 좋아요 총 갯수
    public Integer likeCount(Integer boardNum);
//  좋아요 갯수 추가
    public void likeInsert(LikeVO likeVO);
//  좋아요 갯수 감소
    public void likeDown(LikeVO likeVO);

    public Integer CountUp(Integer boardNum);
}
