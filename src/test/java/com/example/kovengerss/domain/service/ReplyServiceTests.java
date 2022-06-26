package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.ReplyVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ReplyServiceTests {
    @Autowired
    private ReplyService replyService;

//    @Test
//    public void registerTest(){
//            ReplyVO replyVO = new ReplyVO();
//
//            replyVO.setBoardNum(6496);
//            replyVO.setReplyContent("댓글 테스트123");
//            replyVO.setUserNum(2);
//
//            replyService.register(replyVO);
//    }

//    @Test
//    public void readTest(){
//        log.info(replyService.read(25L).toString());
//    }

//    @Test
//    public void modifyTest(){
//        ReplyVO replyVO = replyService.read(25L);
//        replyVO.setReplyContent("수정된 댓글 내용");
//        replyService.modify(replyVO);
//    }

//    @Test
//    public void removeTest(){
//        replyService.remove(25L);
//    }

//    @Test
//    public void getListTest(){
//        replyService.getList(new Criteria(1, 10), 5181L).stream().map(reply -> reply.getReplyContent()).forEach(log::info);
//    }

//    @Test
//    public void getTotalTest(){
//        log.info("COUNT : " + replyService.getTotal(5181L));
//    }


}
