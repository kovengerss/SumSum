package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.BoardDAO;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.Criteria;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("board") @Primary
public class BoardServiceImpl implements BoardService{
    private final BoardDAO boardDAO;


    @Override
    public List<BoardVO> getList(BoardVO boardVO, Criteria criteria) {return boardDAO.getList(boardVO, criteria);}

    @Override
    public void boardInsert(BoardVO boardVO) {boardDAO.boardInsert(boardVO);}
    //return 타입은 해당 DAO 보면서 참고 하세요. 6월17일 강의 1시간05분 참고.
    @Override
    public BoardVO boardSelectOne(Integer boardNum) {return boardDAO.boardSelectOne(boardNum);}

    @Override
    public boolean boardUpdate(BoardVO boardVO) {return boardDAO.boardUpdate(boardVO);}

    @Override
    public boolean boardDelete(Integer boardNum) {return boardDAO.boardDelete(boardNum);}

    @Override
    public int boardGetTotal(BoardVO boardVO) {return boardDAO.boardGetTotal(boardVO);}

    @Override
    public String boardGetField(BoardVO boardVO) {return boardDAO.boardGetField(boardVO);}

    @Override
    public BoardVO boardGetTitle(BoardVO boardVO){return boardDAO.boardGetTitle(boardVO);}

    @Override
    public List<BoardVO> getListAll(BoardVO boardVO){return boardDAO.getListAll(boardVO);}

    @Override
    public Integer replyCount(Integer boardNum){return boardDAO.replyCount(boardNum);}
}