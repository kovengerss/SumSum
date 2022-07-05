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
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MainController {
    @GetMapping("main/community/article")
    public void getCommunityArticle(Model model){
        List<BoardVO> boardVOList = new ArrayList<>();
        BoardVO boardVO = new BoardVO();
        boardVO.setBoardNum(1);
        boardVO.setBoardTitle("title 1");
        boardVO.setBoardContent("테스트 내용입니다. 그냥 읽기만 하세요.");
        boardVOList.add(boardVO);
        model.addAttribute("boardList", boardVOList);
        model.addAttribute("boardContent", boardVO.getBoardContent());
        log.info("글 전체 LIST : " + boardVOList);
        log.info("글 내용 : "+ boardVO.getBoardContent());
    }

    @GetMapping("company")
    public void intruCompany(){
        ;
    }






}
