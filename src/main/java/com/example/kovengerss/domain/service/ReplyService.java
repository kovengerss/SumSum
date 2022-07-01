package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.ReplyDAO;
import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.domain.vo.ReplyVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyService {

    private final ReplyDAO replyDAO;

    //    댓글 등록
    public void register(ReplyVO replyVO){
        replyDAO.register(replyVO);
    }
    //    댓글 1개 조회
    public ReplyVO read(Integer replyNum){
        return replyDAO.read(replyNum);
    }
    //    댓글 삭제
    public void remove(Integer replyNum){
        replyDAO.remove(replyNum);
    }
    //    댓글 수정
    public void modify(ReplyVO replyVO){
        replyDAO.modify(replyVO);
    }
    //    댓글 목록
    public List<ReplyVO> getList(Criteria criteria, Integer boardNum){
        return replyDAO.getList(criteria, boardNum);
    }
    //    댓글 개수
    public Integer getTotal(Integer boardNum){
        return replyDAO.getTotal(boardNum);
    }
}