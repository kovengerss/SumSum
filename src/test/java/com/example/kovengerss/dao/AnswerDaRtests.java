package com.example.kovengerss.dao;

import com.example.kovengerss.domain.dao.AnswerDAO;
import com.example.kovengerss.domain.vo.AnswerVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AnswerDaRtests {

    @Autowired
    private AnswerDAO answerDAO;


    /*@Test
    public void getList(){ //성공
        answerDAO.getList().stream().map(AnswerVO::toString).forEach(log::info);
    }*/


    @Test
    public void update(){
        AnswerVO answerVO = answerDAO.answerSelectOne(39);
        answerVO.setAnswerTitle("코빌런");
        answerVO.setAnswerTitle("코빌러들들");

        log.info("업데이트:"+ answerDAO.answerUpdate(answerVO));

    }

}
