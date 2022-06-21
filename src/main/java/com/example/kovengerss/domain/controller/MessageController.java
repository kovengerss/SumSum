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
    public RedirectView register(MessageVO messageVO, RedirectAttributes rttr){
        log.info("----------------------------");
        log.info("register............. : " + messageVO);
        log.info("----------------------------");

        messageService.msgInsert(messageVO);
        rttr.addFlashAttribute("messageNum", messageVO.getMessageNum() );
        return new RedirectView("/list");
    }


    @GetMapping("list")
    public String getList(Model model){
        log.info("----------------------------");
        log.info("list.............");
        log.info("----------------------------");

        model.addAttribute("messageList", messageService.getList());
        return "/letter";
    }

    @PostMapping("remove")
    public String remove(MessageVO messageVO,Model model){
        log.info("----------------------------");
        log.info("remove............. : ");
        log.info("----------------------------");

        messageService.msgDelete(messageVO);
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