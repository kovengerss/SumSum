package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.BoardService;
import com.example.kovengerss.domain.service.ReplyService;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.domain.vo.ReplyVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//
//@Slf4j
//@RequiredArgsConstructor
//@RequestMapping("/board/*")
//@Controller
//public class ReplyListController {
//    private final ReplyService replyService;
//
//    @GetMapping("boardList")
//    public void getReply(ReplyVO replyVO, Model model){
//        log.info("나오는지 확인 위함"+replyVO.getBoardNum());
//        Integer boardNum = replyVO.getBoardNum();
//        replyService.getTotal(boardNum);
//        model.addAttribute("replyTotal" , replyService.getTotal(boardNum));
//    }
//
//}
