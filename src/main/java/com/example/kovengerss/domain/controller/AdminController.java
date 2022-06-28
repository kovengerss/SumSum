package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.AdminService;
import com.example.kovengerss.domain.vo.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

        return "redirect:/adminpage";
    }
    @GetMapping("adminpage")
    public String getList(Criteria criteria, Model model, BoardVO boardVO){
        log.info("----------------------------");
        log.info("list............. : " + criteria);
        log.info("----------------------------");
//        if(httpSession.getAttribute(adminVO.getAdminId()).equals(null)){
//            return "/adminLogin";
//        }
        model.addAttribute("boardList", adminService.getList(boardVO,criteria));
        model.addAttribute("pageDTO", new PageDTO(criteria, adminService.boardGetTotal(boardVO)));
        log.info("---------------완료-----------------");
        return "/adminpage";
    }

    @GetMapping("adminAppilField")
    public String getAppil(Criteria3 criteria3, Model model, BoardVO boardVO){
        log.info("----------------------------");
        log.info("list............. : " + criteria3);
        log.info("----------------------------");
        boardVO.setBoardField("어필하기");
        model.addAttribute("appilList", adminService.getFieldAppil(boardVO,criteria3));
        model.addAttribute("pageDTO", new Page3DTO(criteria3, adminService.boardGetTotalField(boardVO)));
        log.info("---------------완료-----------------");
        return "/adminAppilField";
    }
    @GetMapping("adminBoardField")
    public String getBoard(Criteria2 criteria2, Model model, BoardVO boardVO){
        log.info("----------------------------");
        log.info("list............. : " + criteria2);
        log.info("----------------------------");
        boardVO.setBoardField("고민상담");
        model.addAttribute("BoardList", adminService.getFieldBoard(boardVO,criteria2));
        model.addAttribute("pageDTO", new Page2DTO(criteria2, adminService.boardGetTotalField(boardVO)));
        log.info("---------------완료-----------------");
        return "/adminBoardField";
    }
    @GetMapping("adminReviewField")
    public String getReview(Criteria1 criteria1, Model model, BoardVO boardVO){
        log.info("----------------------------");
        log.info("list............. : " + criteria1);
        log.info("----------------------------");
        boardVO.setBoardField("후기");
        model.addAttribute("reviewList", adminService.getFieldReview(boardVO,criteria1));
        model.addAttribute("pageDTO", new Page1DTO(criteria1, adminService.boardGetTotalField(boardVO)));
        log.info("---------------완료-----------------");
        return "/adminReviewField";
    }
    @GetMapping("adminPointField")
    public String getPoint(){
        return "/adminPointField";
    }
    @GetMapping("adminBlackList")
    public String getBlackList(Criteria criteria, Model model, BoardVO boardVO){
        log.info("----------------------------");
        log.info("list............. : " + criteria);
        log.info("----------------------------");
        model.addAttribute("blackList", adminService.getCount(boardVO,criteria));
        model.addAttribute("pageDTO", new PageDTO(criteria, adminService.boardGetWarning(boardVO)));
        log.info("---------------완료-----------------");
        return "/adminBlackList";
    }

    //    게시글 상세보기
    @GetMapping("adminRead")
    public void read(Long boardNum, HttpServletRequest req, Model model){
        log.info("----------------------------");
        log.info(req.getRequestURI() + "............. : " + boardNum);
        log.info("----------------------------");
        adminService.get(boardNum);
        model.addAttribute("board", adminService.get(boardNum));
    }

    @GetMapping("delete")
    @ResponseBody
    public String delete(Long boardNum, Criteria criteria, Model model, BoardVO boardVO){
        log.info("--------들어옴----------");
        log.info(String.valueOf(adminService.boardDelete(boardNum)));
        adminService.boardDelete(boardNum);
        return "/adminpage";
    }

    @GetMapping("logout")
    public String logout(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:/adminLogin";
    }
}
