package com.example.kovengerss.dao;

import com.example.kovengerss.domain.dao.MessageDAO;
import com.example.kovengerss.domain.vo.MessageVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class messageDaoTests {

    @Autowired
    private MessageDAO messageDAO;

       /* @Test
        public void getListTest(){
        messageDAO.msgGetList().stream().map(MessageVO::toString).forEach(log::info);
    }*/

   /* @Test
    public void update(){ // 성공
       MessageVO messageVO = messageDAO.msgSelectOne(1);
       messageVO.setMessageTitle("코벤져스");
       messageVO.setMessageContent("코벤져스 화이팅 아자아자");
       messageDAO.msgUpdate(messageVO);
    }*/

}