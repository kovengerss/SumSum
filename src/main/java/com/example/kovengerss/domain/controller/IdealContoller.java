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
    public RedirectView idealRegister(IdealVO idealVO,RedirectAttributes rttr){
        log.info("----------------------------");
        log.info("register............. : " + idealVO);
        log.info("register............. : ");
        log.info("----------------------------");

        idealService.idealInsert(idealVO);
        rttr.addFlashAttribute("messageNum",idealVO.getIdealNum());
        return new RedirectView("/listideal");
    }


    @GetMapping("listideal")
    public String getList(Model model){
        log.info("----------------------------");
        log.info("list.............");
        log.info("----------------------------");

      /*  model.addAttribute("messageList", idealService.);*/
        return "/myPage";
    }

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
