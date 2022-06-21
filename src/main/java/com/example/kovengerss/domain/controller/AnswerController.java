package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.AnswerService;
import com.example.kovengerss.domain.service.AnswerServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
@RequiredArgsConstructor
public class AnswerController {

    private final AnswerService answerService;


}