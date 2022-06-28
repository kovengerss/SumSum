package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.BoardService;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.domain.vo.PageDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//@Slf4j
//@RequiredArgsConstructor
//@RequestMapping("/board/*")
//public class BoardListController {
//    private BoardService boardService;
//
//    @GetMapping({"board","appilBoard","reviewBoard"})
//    public void getListAll(BoardVO boardVO, Model model){
//        log.info("----------------------------");
//        log.info("list.............");
//        log.info("----------------------------");
//
//        model.addAttribute("boardAllList", boardService.getListAll(boardVO));
//    }
//}
