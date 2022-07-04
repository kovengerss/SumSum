package com.example.kovengerss.mapper;


import com.example.kovengerss.domain.service.BoardService;
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
    //게시글 카테고리 가져오기
    public String getField(BoardVO boardVO);
    //제목 가져오기 (DESC)
    public BoardVO getTitle(BoardVO boardVO);
//    전체게시글 가져오기
    public List<BoardVO> getListAll(BoardVO boardVO);

    public Integer replyCount(Integer boardNum);
}