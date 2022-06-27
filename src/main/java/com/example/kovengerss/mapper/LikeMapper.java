package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.LikeVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LikeMapper {
    public Integer select(BoardVO boardVO);

    public void insert(LikeVO likeVO);

    public void heartUp(BoardVO boardVO);

    public BoardVO delete(LikeVO likeVO);

    public void heartDown(BoardVO boardVO);

}
