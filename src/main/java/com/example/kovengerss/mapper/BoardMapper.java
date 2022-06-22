package com.example.kovengerss.mapper;


import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.Criteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface BoardMapper {

    //게시글 목록
    public List<BoardVO> getList(@Param("boardVO")BoardVO boardVO,@Param("criteria")Criteria criteria);
    //게시글 추가
    public void insert(BoardVO boardVO);
    //게시글 한 개 가져오기
    public BoardVO select(Integer boardNum);
    //게시글 수정
    public int update(BoardVO boardVO);
    //게시글 삭제
    public int delete(Integer boardNum);
    //게시글 전체 개수
    public int getTotal(BoardVO boardVO);
    //게시글 작성 시간 가져오기
    public String getRegisterDate(Integer boardNum);
    //게시글 수정 시간 가져오기
    public String getUpdateDate(Integer boardNum);
    //게시글 카테고리 가져오기
    public String getField(Integer boardNum);

}