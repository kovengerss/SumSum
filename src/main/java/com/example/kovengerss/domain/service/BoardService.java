package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    //게시글 목록
    public List<BoardVO> getList();
    //게시글 추가
    public void boardInsert(BoardVO boardVO);
    //게시글 한 개 가져오기
    public BoardVO boardSelectOne(Integer boardNumber);
    //게시글 수정
    public void boardUpdate(BoardVO boardVO);
    //게시글 삭제
    public void boardDelete(BoardVO boardVO);
    //게시글 전체 개수
    public void getTotal();
    //게시글 작성 시간 가져오기
    public String getRegisterDate();
    //게시글 수정 시간 가져오기
    public String getUpdateDate();
    //게시글 신고 횟수 가져오기
    public Integer getWarningCount();

}
