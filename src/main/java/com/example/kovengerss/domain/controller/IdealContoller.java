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
    public String idealRegister(IdealVO idealVO, RedirectAttributes rttr, HttpServletRequest req){
        log.info("----------------------------");
        log.info("register............. : " + idealVO);
        log.info("register............. : ");
        log.info("----------------------------");
        HttpSession session = req.getSession();
        Integer userNum = (Integer)session.getAttribute("userNum");
        idealVO.setUserNum(userNum);

        idealService.idealInsert(idealVO);
        rttr.addFlashAttribute("idealNum",idealVO.getIdealNum());
       /* rttr.addFlashAttribute("ideal",idealService.idealSelect(idealVO.getIdealNum()));*/

        return "/mypage";
    }



/*    @PostMapping("boardWrite")  // 종욱님 코드
    public RedirectView boardInsert(BoardVO boardVO, RedirectAttributes rttr,HttpServletRequest req){
        log.info("----------------------------");
        log.info("write.............");
        log.info("----------------------------");
        HttpSession session = req.getSession();
        Integer userNum = (Integer)session.getAttribute("userNum");

        boardVO.setUserNum(userNum);
        boardService.boardInsert(boardVO);

        rttr.addFlashAttribute("userNum",boardVO.getUserNum());
        rttr.addFlashAttribute("boardNum", boardVO.getBoardNum());
        rttr.addFlashAttribute("boardField",boardVO.getBoardField());

        return new RedirectView("/board/boardList");
    }*/

    @GetMapping("listideal")
    public String getList(Model model){
        log.info("----------------------------");
        log.info("list.............");
        log.info("----------------------------");


        /*model.addAttribute("ideal", idealService.idealSelect(idealVO.getIdealNum()));*/
        return "/myPage";
    }

    //이상형 수정 페이지로 가는 get방식
    @GetMapping("modifyIdeal")
    public String modifyIdeal(int idealNum,Model model){

        model.addAttribute("ideal",idealService.idealSelect(idealNum));
        return "/marry";
    }

    @PostMapping("modifyIdeal")
    public void modifyIdeal(IdealVO idealVO){
        idealService.idealUpdate(idealVO);
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
