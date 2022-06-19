package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.AnswerDAO;
import com.example.kovengerss.domain.vo.AnswerVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("answer") @Primary
public class AnswerServiceImpl implements AnswerService{
    private final AnswerDAO answerDAO;

    @Override
    public void answerInsert(AnswerVO answerVO) {

    }

    @Override
    public AnswerVO answerSelectOne(Integer answerNum) {
        return null;
    }

    @Override
    public void answerUpdate(AnswerVO answerVO) {

    }

    @Override
    public void answerDelete(AnswerVO answerVO) {

    }

    @Override
    public String answerGetSendDate() {
        return null;
    }

    @Override
    public String answerSelectTitle(AnswerVO answerVO) {
        return null;
    }

    @Override
    public String answerSelectContent(AnswerVO answerVO) {
        return null;
    }
}
