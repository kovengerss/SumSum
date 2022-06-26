package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.IdealService;
import com.example.kovengerss.domain.vo.IdealVO;
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
public class IdealContoller {
    private final IdealService idealService;

    @GetMapping("marry")
    public void goLove(){
        ;
    }

    @PostMapping("idealRegister")
    public String idealRegister(IdealVO idealVO, RedirectAttributes rttr, HttpServletRequest req,Model model){
        log.info("----------------------------");
        log.info("register............. : " + idealVO);
        log.info("register............. : ");
        log.info("----------------------------");
        HttpSession session = req.getSession();
        Integer userNum = (Integer)session.getAttribute("userNum");
        idealVO.setUserNum(userNum);

        idealService.idealInsert(idealVO);
        Integer idealNum =idealVO.getIdealNum();
        session.setAttribute("idealNum",idealNum);
        /* rttr.addFlashAttribute("idealNum",idealVO.getIdealNum());*/
        /*  log.info(idealVO.getIdealNum().toString());*/
        /* rttr.addFlashAttribute("ideal",idealService.idealSelect(idealVO.getIdealNum()));*/

        return getOne(idealNum,model,req);
    }


    @GetMapping("getMyIdeal")
    public String getOne(Integer idealNum, Model model,HttpServletRequest req){
        log.info("----------------------------");
        log.info("list............."+idealNum);
        log.info("----------------------------");
        HttpSession session =   req.getSession();
        Integer idealNums = (Integer)session.getAttribute("idealNum");

                                                                            //여기서 디비버의 sequence연동에 문제가 생김
        model.addAttribute("idealVO", idealService.idealSelect(idealNums+1));
        return "/myPage";
    }

    //이상형 수정 페이지로 가는 get방식
    @GetMapping("/updateMarry")
    public void getUpdate(Integer idealNum,Model model){
    /*    log.info("----------------------------");
        log.info("......수정하기 들어옴 처음....... : " + idealNum);
        log.info("----------------------------");*/

      model.addAttribute("ideal",idealService.idealSelect(idealNum));
/*      log.info(idealService.idealSelect(idealNum).toString());*/
    }


    @PostMapping("modifyIdeal")
    public String modifyIdeal(IdealVO idealVO,Model model,HttpServletRequest req){

         Integer idealNum = idealVO.getIdealNum();
        idealService.idealUpdate(idealVO);

        return getOne(idealNum,model,req);
    }



    @GetMapping("idealList")
    public String getList(Model model,HttpServletRequest req){
        log.info("----------------------------");
        log.info("list.............");
        log.info("----------------------------");
        /*HttpSession session =   req.getSession();
        String userName = (String)session.getAttribute("userName");*/

        model.addAttribute("idealList",idealService.getList());

        return "/pick";
    }





 /*   @PostMapping("modifyIdeal")
    public String modifyIdealTwo(IdealVO idealVO, RedirectAttributes rttr, HttpServletRequest req) {

        HttpSession session = req.getSession();
        Integer userNum = (Integer)session.getAttribute("userNum");
        idealVO.setUserNum(userNum);

        idealService.idealInsert(idealVO);
        rttr.addFlashAttribute("idealNum",idealVO.getIdealNum());
        *//*idealService.idealUpdate(idealVO);*//*
        return "/mypage";
    }*/



    /*public RedirectView register(MessageVO messageVO, RedirectAttributes rttr){
        log.info("----------------------------");
        log.info("register............. : " + messageVO);
        log.info("register............. : " + messageVO.getMessageNum());
        log.info("----------------------------");

        messageService.msgInsert(messageVO);
        rttr.addFlashAttribute("messageNum", messageVO.getMessageNum() );
        return new RedirectView("/list");
    }*/


}