package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardDAO {
    private final BoardMapper boardMapper;

    //게시글 목록
    public List<BoardVO> getList(){return boardMapper.getList();}
    //게시글 추가
    public void boardInsert(BoardVO boardVO){boardMapper.insert(boardVO);}
    //게시글 한 개 가져오기
    public BoardVO boardSelectOne(Integer boardNum){return boardMapper.select(boardNum);}
    //게시글 수정
    public boolean boardUpdate(BoardVO boardVO){return boardMapper.update(boardVO) == 1;}
    //게시글 삭제
    public boolean boardDelete(Integer boardNum){return boardMapper.delete(boardNum) == 1;}
    //게시글 전체 개수
    public int boardGetTotal(){return boardMapper.getTotal();}
    //게시글 카테고리 가져오기
    public String boardGetField(Integer boardNum){return boardMapper.getField(boardNum);}

}