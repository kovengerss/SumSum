package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.vo.LikeVO;
import com.example.kovengerss.mapper.LikeMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class LikeMapperTests {
    @Autowired
    private LikeMapper likeMapper;

//    @Test
//    public void insertTest(){
//        LikeVO likeVO = new LikeVO();
//
//        likeVO.setUserNum(2);
//        likeVO.setBoardNum(6627);
//
//        likeMapper.likeInsert(likeVO);
//    }

//    @Test
//    public void CountTest(){
//        likeMapper.likeCount(6627);
//    }

//    @Test
//    public void DelteTest(){
//        LikeVO likeVO = new LikeVO();
//        likeVO.setBoardNum(6627);
//        likeVO.setUserNum(2);
//        likeMapper.likeDown(likeVO);
//    }


}
