package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class BoardDaoTests {
    @Autowired
    private BoardDAO boardDAO;

//    @Test
//    public void getListTest() {
//        boardDAO.getList().stream().map(BoardVO::toString).forEach(log::info);
//    }
//}

//    @Test
//    public void insertTest() {
//        BoardVO boardVO = new BoardVO();
//        boardVO.setBoardTitle("새롭게 추가된 게시글 제목1");
//        boardVO.setBoardContent("새롭게 추가된 게시글 내용1");
//        boardVO.setBoardField("고민상담");
//
//        boardDAO.boardInsert(boardVO);
//        log.info("추가된 게시글 번호 : " + boardVO.getBoardNum());
//    }

//    @Test
//    public void selectTest(){
//        BoardVO  boardVO = new BoardVO();
//        boardVO.setBoardField("고민상담");
//        boardVO.setBoardNum(6405);
//        log.info(boardDAO.boardSelectOne(boardVO).toString());
//    }

//    @Test
//    public void updateTest(){
//        BoardVO boardVO = boardDAO.boardSelectOne(6395);
//        boardVO.setBoardTitle("수정된 게시글 제목");
//        boardVO.setBoardContent("수정된 게시글 내용");
//        boardVO.setBoardField("후기");
//
//        log.info("UPDATE : " + boardDAO.boardUpdate(boardVO));
//    }

//    @Test
//    public void deleteTest(){
//        log.info("DELETE : " + boardDAO.boardDelete(6395));
//    }

//    @Test
//    public void getTotalTest(){
//        BoardVO boardVO = new BoardVO();
//        boardVO.setBoardField("고민상담");
//        log.info("총 게시글 : " + boardDAO.boardGetTotal(boardVO));
//    }

    @Test
    public void getFieldTest(){
        BoardVO boardVO = new BoardVO();
        boardVO.setBoardNum(6405);
        log.info("필드명 : " + boardDAO.boardGetField(boardVO));
    }
}