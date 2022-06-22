package com.example.kovengerss.Mapper;


import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.MessageVO;
import com.example.kovengerss.mapper.MessageMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MessageMapperTests {
    @Autowired
    private MessageMapper messageMapper;

   /* @Test
    public void getListTest(){
        messageMapper.getList().stream().map(MessageVO::toString).forEach(log::info);
    }*/


  /*  @Test
    public void insertTest(){
        MessageVO messageVO = new MessageVO();
        messageVO.setMessageTitle("인설트테스트901 제목");
        messageVO.setMessageContent("인설트테스트901 내용");
        messageMapper.insert(messageVO);
        log.info("인설트된 메세지 번호 :" + messageVO.getMessageNum());

    }*/

    /*@Test
    public void selectone(){
        messageMapper.select(25);
        log.info( messageMapper.select(25).toString());

    }*/

  /* @Test
    public void selectContent(){
        messageMapper.selectContent(3);
    }*/
    /*@Test
    public void deleteTest(){
        log.info("DELETE COUNT : " +messageMapper.delete(116));
    }*/

}