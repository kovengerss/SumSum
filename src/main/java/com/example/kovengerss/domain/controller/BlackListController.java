package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.BlackListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class BlackListController {
    private final BlackListService blackListService;

    /*@GetMapping("adminPage")
    public void blackListNum(){

    }*/


}
