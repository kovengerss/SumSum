package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.BoardService;
import com.example.kovengerss.domain.service.ReplyService;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.ReplyVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/reply/*")
@RestController
public class ReplyListController {
    private final ReplyService replyService;
    private final BoardService boardService;

    @GetMapping("/boardList/{boardNum}")
    public Integer getReply(@PathVariable("boardNum") Integer boardNum){

        replyService.getTotal(boardNum);
        return replyService.getTotal(boardNum);
    }

}
