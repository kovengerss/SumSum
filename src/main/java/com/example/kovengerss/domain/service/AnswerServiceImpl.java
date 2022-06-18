package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.AnswerDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("answer") @Primary
public class AnswerServiceImpl {
    private final AnswerDAO answerDAO;
}
