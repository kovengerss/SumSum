package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.Criteria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    //게시글 목록
    public List<BoardVO> getList(BoardVO boardVO, Criteria criteria);
    //게시글 추가
    public void boardInsert(BoardVO boardVO);
    //게시글 한 개 가져오기
    public BoardVO boardSelectOne(Integer boardNum);
    //게시글 수정
    public boolean boardUpdate(BoardVO boardVO);
    //게시글 삭제
    public boolean boardDelete(Integer boardNum);
    //게시글 전체 개수
    public int boardGetTotal(BoardVO boardVO);
    //게시글 카테고리 가져오기
    public String boardGetField(BoardVO boardVO);
    //제목가져오기
    public BoardVO boardGetTitle(BoardVO boardVO);
}