package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.domain.vo.ReplyVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class ReplyDAOTests {
    @Autowired
    private ReplyDAO replyDAO;

//    @Test
//    public void registerTest(){
//            ReplyVO replyVO = new ReplyVO();
//
//            replyVO.setBoardNum(6496);
//            replyVO.setReplyContent("댓글 테스트2");
//            replyVO.setUserNum(2);
//
//            replyDAO.register(replyVO);
//    }

//    @Test
//    public void readTest(){
//        log.info(replyDAO.read(2).toString());
//    }

//    @Test
//    public void modifyTest(){
//        ReplyVO replyVO = replyDAO.read(2);
//        replyVO.setReplyContent("수정된 댓글 내용123");
//        replyDAO.modify(replyVO);
//    }

//    @Test
//    public void removeTest(){
//        replyDAO.remove(2);
//    }

//    @Test
//    public void getListTest(){
//        replyDAO.getList(new Criteria(1, 10), 6496).stream().map(reply -> reply.getReplyContent()).forEach(log::info);
//    }

//    @Test
//    public void getTotalTest(){
//        log.info("COUNT : " + replyDAO.getTotal(6496));
//    }
//    @Test
//    public void getUserName(){
//        ReplyVO replyVO = new ReplyVO();
//        replyVO.setUserNum(2);
//        log.info("유저의 이름 가져온다 :: " + replyDAO.getUserName(replyVO));
//    }
//    @Test
//    public void userNum(){
//        log.info("유저 번호" + replyDAO.userNum(140));
//    }
}
