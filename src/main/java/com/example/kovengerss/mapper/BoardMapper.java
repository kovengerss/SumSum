package com.example.kovengerss.mapper;


import com.example.kovengerss.domain.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    //게시글 목록
    public List<BoardVO> getList();
    //게시글 추가
    public void insert(BoardVO boardVO);
    //게시글 한 개 가져오기
    public BoardVO select(Integer boardNumber);
    //게시글 수정
    public void update(BoardVO boardVO);
    //게시글 삭제
    public void delete(BoardVO boardVO);
    //게시글 전체 개수
    public void getTotal();
    //게시글 작성 시간 가져오기
    public String getRegisterDate();
    //게시글 수정 시간 가져오기
    public String getUpdateDate();
    //게시글 신고 횟수 가져오기
    public Integer getWarningCount();
    //게시글 제목 가져오기
    public String getTitle(BoardVO boardVO);
    //게시글 내용 가져오기
    public String getContent(BoardVO boardVO);
    //게시글 카테고리 가져오기
    public String getField(BoardVO boardVO);

}
