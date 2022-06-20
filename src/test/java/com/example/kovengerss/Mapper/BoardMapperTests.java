package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BoardMapperTests {
    @Autowired
    private BoardMapper boardMapper;
    /*@Test
    public void getListTest(){
        boardMapper.getList().stream().map(BoardVO::toString).forEach(log::info);

    }*/

         @Test
        public void insertTest(){
        BoardVO boardVO = new BoardVO();
        boardVO.setBoardTitle("새롭게 추가된 게시글 제목9");
        boardVO.setBoardContent("새롭게 추가된 게시글 내용99");
        boardMapper.insert(boardVO);


    }
}
