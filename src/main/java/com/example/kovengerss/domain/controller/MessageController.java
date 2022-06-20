package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;
    // 쪽지 보내기
    @PostMapping("pick")
    public void msgInsert(){

    }
    // 쪽지 발신함
    @GetMapping("letter")
    public void msgSendList(){

    }

    // 쪽지 발신함
    @GetMapping("letter")
    public void msgGetList(){

    }

}
