package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.MessageService;
import com.example.kovengerss.domain.vo.MessageVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;

    //글쓰러가기
    @GetMapping("pick")
    public void write(){
        ;
    }
    @PostMapping("register")
    public RedirectView register(MessageVO messageVO, RedirectAttributes rttr, HttpServletRequest req){
        log.info("----------------------------");
        log.info("register............. : " + messageVO);
        log.info("register............. : " + messageVO.getMessageNum());
        log.info("----------------------------");
        HttpSession session = req.getSession();
        Integer userNum = (Integer)session.getAttribute("userNum");
        messageVO.setUserNum(userNum);

        messageService.msgInsert(messageVO);
        rttr.addFlashAttribute("userNum", messageVO.getUserNum());
        rttr.addFlashAttribute("messageNum", messageVO.getMessageNum());
        return new RedirectView("/main");
    }

/*    @PostMapping("boardWrite")  // 종욱님 코드
    public RedirectView boardInsert(BoardVO boardVO, RedirectAttributes rttr,HttpServletRequest req){
        log.info("----------------------------");
        log.info("write.............");
        log.info("----------------------------");
        HttpSession session = req.getSession();
        Integer userNum = (Integer)session.getAttribute("userNum");

        boardVO.setUserNum(userNum);
        boardService.boardInsert(boardVO);

        rttr.addFlashAttribute("userNum",boardVO.getUserNum());
        rttr.addFlashAttribute("boardNum", boardVO.getBoardNum());
        rttr.addFlashAttribute("boardField",boardVO.getBoardField());

        return new RedirectView("/board/boardList");
    }*/

    @PostMapping("registerIn")
    public RedirectView registerIn(MessageVO messageVO, RedirectAttributes rttr,HttpServletRequest req){
        log.info("----------------------------");
        log.info("register............. : " + messageVO);
        log.info("register............. : " + messageVO.getMessageNum());
        log.info("----------------------------");
        HttpSession session = req.getSession();
        Integer userNum = (Integer)session.getAttribute("userNum");
        messageVO.setUserNum(userNum);

        messageService.msgInsert(messageVO);
        rttr.addFlashAttribute("messageNum", messageVO.getMessageNum() );
        return new RedirectView("/list");
    }


    @GetMapping("letter")
    public void letter(){ ; }

    @GetMapping("list")
    public String getList(Model model){
        log.info("----------------------------");
        log.info("list.............");
        log.info("----------------------------");

        model.addAttribute("messageList", messageService.getList());
        model.addAttribute("messageCount",messageService.msgGetTotal());
        return "/letter";
    }

    @GetMapping("remove")
    public String remove(Integer messageNum,Model model){
        log.info("----------------------------");
        log.info("remove.............dsd : " + messageNum);
        log.info("----------------------------");

        messageService.msgDelete(messageNum);
        return getList(model);
    }

/*
    // 쪽지 보내기
    @GetMapping("pick")
    public void msgInsert(){

    }

    @PostMapping("pick")
    public String msgShow(MessageVO messageVO, Model model){

       *//* messageService.msgInsert(messageVO);*//*
        model.addAttribute("title",messageVO.getMessageTitle());
        model.addAttribute("content",messageVO.getMessageContent());

        return "/letter";
    }


    // 쪽지 발신함
    @GetMapping("sendLetter")
    public void msgSendList(){

    }

    // 쪽지 수신함
    @GetMapping("getLetter")
    public void msgGetList(){

    }*/

}