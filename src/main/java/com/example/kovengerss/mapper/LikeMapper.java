package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.LikeVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LikeMapper {
//  게시판 좋아요 총 갯수
    public Integer likeCount(Integer boardNum);
//  좋아요 갯수 추가
    public void likeInsert(LikeVO likeVO);
//  좋아요 갯수 감소
    public void likeDown(LikeVO likeVO);
//  좋아요 눌럿는지 안눌럿는지 확인
    public Integer userCheck(LikeVO likeVO);



}
