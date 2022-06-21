package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.LikeVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LikeMapper {
    //좋아요 갯수 조회
    public Integer select(LikeVO likeVO);
    //좋아요 누르면 insert 좋아요 +1
    public void insert(LikeVO likeVO);
    //좋아요 누르면 delete 좋아요 취소 -1
    public void delete(LikeVO likeVO);
    //해당 좋아요 게시판 글 번호(boardnum) 조회
    public Integer getBoardNum(LikeVO likeVO);


}
