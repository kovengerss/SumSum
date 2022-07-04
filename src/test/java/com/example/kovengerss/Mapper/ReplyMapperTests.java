package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.domain.vo.ReplyVO;
import com.example.kovengerss.domain.vo.UserVO;
import com.example.kovengerss.mapper.ReplyMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.IntStream;

@Slf4j
public class ReplyMapperTests {
    @Autowired
    private ReplyMapper replyMapper;

//    @Test
//    public void getUserNameTest(){
//        replyMapper.getUserName(2);
//    }

//    @Test
//    public void insertTest(){
//            ReplyVO replyVO = new ReplyVO();
//
//            replyVO.setBoardNum(6496);
//            replyVO.setReplyContent("댓글 테스트" + 1);
//            replyVO.setUserNum(2);
//
//            replyMapper.insert(replyVO);
//    }

//    @Test
//    public void selectTest(){
//        log.info(replyMapper.select(1L).toString());
//    }

//    @Test
//    public void updateTest(){
//        ReplyVO replyVO = replyMapper.select(1);
//        replyVO.setReplyContent("수정된 댓글 내용2");
//        replyMapper.update(replyVO);
//    }

//    @Test
//    public void deleteTest(){
//        replyMapper.delete(1);
//    }

//    @Test
//    public void getListTest(){
//        replyMapper.getList(new Criteria(1, 10), 6496).stream().map(reply -> reply.getReplyContent()).forEach(log::info);
//    }

//    @Test
//    public void getTotalTest(){
//        log.info("COUNT : " + replyMapper.getTotal(6496));
//    }
//    @Test
//    public void test(){
//        ReplyVO replyVO = new ReplyVO();
//
//        replyVO.setUserNum(2);
//
//        log.info("나오는지 보려고 : " + replyMapper.getUserName(replyVO));
//
//    }

//    @Test
//    public void test(){
//        log.info("유저의 번호: "  +replyMapper.userNum(143));
//    }
}
