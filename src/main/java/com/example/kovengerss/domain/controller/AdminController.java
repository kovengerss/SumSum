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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequiredArgsConstructor
public class AdminController {
    private static final String ADMIN_SESSION_KEY = "adminId";
    private final AdminService adminService;
    // 관리자 로그인
    @GetMapping("adminLogin")
    public void login(){

    }

    @PostMapping("adminLogin")
    public String loginAdmin(String adminId,String adminPw, HttpSession httpSession){
        AdminVO admin = adminService.adminLogin(adminId, adminPw);
        log.info(admin.getAdminId());
        log.info(admin.getAdminPw());
        httpSession.setAttribute("adminId",adminId);
        log.info((String)httpSession.getAttribute(adminId));

        return "redirect:/adminPage";
    }

    /*@GetMapping("adminPage")
    public String adminPage(AdminVO adminVO){
        return "/adminPage";
    }*/




}
