package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.AnswerDAO;
import com.example.kovengerss.domain.vo.AnswerVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("answer") @Primary
public class AnswerServiceImpl implements AnswerService{
    private final AnswerDAO answerDAO;


    @Override
    public List<AnswerVO> getList() {
        return answerDAO.getList();
    }

    @Override
    public void answerInsert(AnswerVO answerVO) {
        answerDAO.answerInsert(answerVO);
    }

    @Override
    public AnswerVO answerSelectOne(int answerNum) {
        return answerDAO.answerSelectOne(answerNum);
    }

    @Override
    public boolean answerUpdate(AnswerVO answerVO) {
        return answerDAO.answerUpdate(answerVO);
    }

    @Override
    public boolean answerDelete(int answerNum) {
        return answerDAO.answerDelete(answerNum);
    }

    @Override
    public String answerGetSendDate(int answerNum) {
        return answerDAO.answerGetSendDate(answerNum);
    }

    @Override
    public String answerSelectTitle(int answerNum) {
        return answerDAO.answerSelectTitle(answerNum);
    }

    @Override
    public String answerSelectContent(int answerNum) {
        return answerDAO.answerSelectContent(answerNum);
    }
}
