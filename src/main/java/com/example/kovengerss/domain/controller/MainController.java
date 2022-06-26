package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.vo.BoardVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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
        boardVOList.add(boardVO);
        model.addAttribute("boardList", boardVOList);
    }
}
