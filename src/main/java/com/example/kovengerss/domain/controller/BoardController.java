package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/board/*")
public class BoardController {
    private final BoardService boardService;
    private Model model;

    @GetMapping("boardList")
    public void getList(Model model){
        log.info("----------------------------");
        log.info("list.............");
        log.info("----------------------------");
        model.addAttribute("boardList", boardService.getList());
    }

    @PostMapping("boardWrite")
    public void boardInsert(){

    }




}
