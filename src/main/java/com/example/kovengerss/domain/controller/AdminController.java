package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.AdminService;
import com.example.kovengerss.domain.service.BoardService;
import com.example.kovengerss.domain.vo.AdminVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@Slf4j
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    // 관리자 로그인
    @GetMapping("adminLogin")
    public void login(){

    }

    @PostMapping("adminLogin")
    public RedirectView login(String adminId, String adminPw, RedirectAttributes rttr){
        log.info("---------------------------adminList-------------------------");
        rttr.addFlashAttribute("adminList",adminService.adminLogin(adminId, adminPw));
        log.info("-----------------------------return-----------------------");
        return new RedirectView("/adminPage");
    }

    /*@GetMapping("adminPage")
    public String adminPage(AdminVO adminVO){
        return "/adminPage";
    }*/




}
