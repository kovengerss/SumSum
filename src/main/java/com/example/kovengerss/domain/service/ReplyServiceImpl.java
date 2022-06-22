package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.ReplyDAO;
import com.example.kovengerss.domain.vo.ReplyVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("reply") @Primary
public class ReplyServiceImpl implements ReplyService{
    private final ReplyDAO replyDAO;

    @Override
    public void replyInsert(ReplyVO replyVO) {

    }

    @Override
    public ReplyVO replySelectOne(Integer replyNum) {
        return null;
    }

    @Override
    public void replyUpdate(ReplyVO replyVO) {

    }

    @Override
    public void replyDelete(ReplyVO replyVO) {

    }

    @Override
    public String replyGetRegisterDate() {
        return null;
    }

    @Override
    public String replyGetUpdateDate() {
        return null;
    }

    @Override
    public Integer replyGetTotal() {
        return null;
    }

    @Override
    public String replyGetContent(ReplyVO replyVO) {
        return null;
    }
}