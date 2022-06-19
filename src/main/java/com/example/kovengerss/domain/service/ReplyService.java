package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.ReplyVO;
import org.springframework.stereotype.Service;

@Service
public interface ReplyService {
    //게시글 답글 작성
    public void replyInsert(ReplyVO replyVO);
    //게시글  답글 한개 가져오기
    public ReplyVO replySelectOne(Integer replyNum);
    //게시글 답글 수정
    public void replyUpdate(ReplyVO replyVO);
    //게시글 답글 삭제
    public void replyDelete(ReplyVO replyVO);
    //답글 시간 가져오기
    public String replyGetRegisterDate();
    //게시글 수정 시간 가져오기
    public String replyGetUpdateDate();
    //게시글에 달린 총 답글 갯수
    public Integer replyGetTotal();
    //게시글 답글 내용 가져오기
    public String replyGetContent(ReplyVO replyVO);
}
