package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    //회원가입
    @PostMapping("sign")
    public void userInsert(){

    }

    //로그인
    @PostMapping("login")
    public void userLogin(){

    }

    //마이페이지 전체정보
    @GetMapping("myPage")
    public void getMyPage(){

    }
    //마이페이지 글 목록
    @GetMapping("myPageText")
    public void getMyPageList(){

    }
    //마이페이지 답장 목록
    @GetMapping("myPageAnswer")
    public void getMyPageAnswerList(){

    }

    //마이페이지 매칭인
    @GetMapping("myPageMatching")
    public void getMyPageMatching(){

    }

    //마이페이지 포인트 내역
    @GetMapping("myPagePoint")
    public void getPointSelect(){

    }

    //연애 선택
    @PostMapping("love")
    public void getLove(){

    }

    //결혼 선택
    @PostMapping("marry")
    public void getMarry(){

    }


}
