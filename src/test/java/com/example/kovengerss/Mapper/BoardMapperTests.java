package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class BoardMapperTests {
    @Autowired
    private BoardMapper boardMapper;
//    @Test
//    public void getListTest(){
//        BoardVO boardVO = new BoardVO();
//        boardVO.setBoardField("어필하기");
//        boardMapper.getList(boardVO,new Criteria()).stream().map(BoardVO::toString).forEach(log::info);
//    }

//    @Test
//    public void test(){
//        boardMapper.replyCount(6649);
//    }

//    @Test
//    public void insertTest(){
//        BoardVO boardVO = new BoardVO();
//        boardVO.setBoardTitle("새롭게 추가된 게시글 제목1");
//        boardVO.setBoardContent("새롭게 추가된 게시글 내용1");
//        boardVO.setUserNum(1);
//        boardVO.setBoardField("후기");
//        boardMapper.insert(boardVO);
//        log.info("추가된 게시글 번호 : " + boardVO.getBoardNum());
//    }

//        @Test
//    public void selectTest(){
//            BoardVO  boardVO = new BoardVO();
//            boardVO.setBoardField("고민상담");
//            boardVO.setBoardNum(6405);
//        log.info(boardMapper.select(boardNum).toString());
//    }

//        @Test
//    public void updateTest(){
//        BoardVO boardVO = boardMapper.select(6378);
//        boardVO.setBoardTitle("수정된 게시글 제목");
//        boardVO.setBoardContent("수정된 게시글 내용");
//        boardVO.setBoardField("후기");
//
//        log.info("UPDATE COUNT : " + boardMapper.update(boardVO));
//    }

//        @Test
//    public void deleteTest(){
//        log.info("DELETE COUNT : " + boardMapper.delete(6378));
//    }

        @Test
    public void getTotalTest(){
            BoardVO boardVO = new BoardVO();
            boardVO.setBoardField("어필하기");
        log.info("총 게시글 : " + boardMapper.getTotal(boardVO));
    }
}