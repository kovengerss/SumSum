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

    @PostMapping("pick")
    public void msgInsert(){

    }

    @GetMapping("letter")
    public void msgList(){

    }


}
