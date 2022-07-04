package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.vo.AnswerVO;
import com.example.kovengerss.mapper.AnswerMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class AnswerMapperTests {
    @Autowired
    private AnswerMapper answerMapper;

    /*@Test
    public void getList(){ //성공
        answerMapper.getList().stream().map(AnswerVO::toString).forEach(log::info);

    }*/

    /*@Test
    public void getSendDate(){//성공

        log.info(answerMapper.getSendDate(1));
    }*/

    /*@Test
    public void delete(){
        log.info("-----------");
        log.info("삭제 성공시 1 : " + answerMapper.delete(1));
        log.info("-----------");
        answerMapper.delete(1);
    }*/

    @Test
    public void insert(){
        AnswerVO answerVO = new AnswerVO();
        answerVO.setAnswerTitle("코");
        answerVO.setAnswerContent("코벤");
        /*answerVO.setMessageNum(1);
        answerVO.setUserNum(1);*/

        answerMapper.insert(answerVO);

        log.info("-----------");
        log.info("추가된 게시글의 번호: " + answerVO.getAnswerNum());
        log.info("-----------");
    }
}