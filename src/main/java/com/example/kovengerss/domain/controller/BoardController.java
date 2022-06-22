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
    // 글 목록
    @GetMapping("boardList")
    public String getList(Model model){
        log.info("----------------------------");
        log.info("list.............");
        log.info("----------------------------");
        model.addAttribute("boardList", boardService.getList());
        return "/board/boardList";
    }
    // 어필 목록
    @GetMapping("appilBoardList")
    public void boardGetAppil(){

    }
    // 후기 목록
    @GetMapping("reviewBoardList")
    public void boardGetReview(){

    }
    // 글 작성
    @PostMapping("boardWrite")
    public void boardInsert(){

    }


}