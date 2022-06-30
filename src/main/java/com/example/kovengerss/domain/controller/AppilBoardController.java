package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.BoardService;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.domain.vo.PageDTO;
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
@RequestMapping("/board/*")
public class AppilBoardController {
    private final BoardService boardService;

    //     글 목록
    @GetMapping("appilBoardList")
    public String getList(BoardVO boardVO, Criteria criteria, Model model){
        log.info("----------------------------");
        log.info("list.............");
        log.info("----------------------------");
        boardVO.setBoardField("어필하기");
        model.addAttribute("appilBoardList", boardService.getList(boardVO,criteria));
        model.addAttribute("pageDTO", new PageDTO(criteria, boardService.boardGetTotal(boardVO)));
        return "/board/appilBoardList";
    }

    @GetMapping({"appilBoard","appilBoardUpdate"})
    public void boardSelectOne(BoardVO boardVO,Integer boardNum,Model model,HttpServletRequest req){

        log.info("----------------------------");
        log.info(req.getRequestURI() + "............. : " + boardNum);
        log.info("----------------------------");

        boardService.boardSelectOne(boardNum);
        model.addAttribute("appilBoard",boardService.boardSelectOne(boardNum));
    }


    //수정
    @PostMapping("appilBoardUpdate")
    public RedirectView boardUpdate(BoardVO boardVO, RedirectAttributes rttr,HttpServletRequest req){

        log.info("-----------");
        log.info("보드 넘버" + boardVO.getBoardNum());

        HttpSession session = req.getSession();
        Integer userNum = (Integer) session.getAttribute("userNum");
        if(userNum == null){
            rttr.addFlashAttribute("loginX",true);
            return new RedirectView("/login");
        }
        boardVO.setUserNum(userNum);
        boardService.boardUpdate(boardVO);

        if (boardVO.getBoardField().equals("고민상담")) {
            rttr.addAttribute("boardNum", boardVO.getBoardNum());
            rttr.addAttribute("boardField", boardVO.getBoardField());
            return new RedirectView("/board/board");
        } else if (boardVO.getBoardField().equals("어필하기")) {
            rttr.addAttribute("boardNum", boardVO.getBoardNum());
            rttr.addAttribute("boardField", boardVO.getBoardField());
            return new RedirectView("/board/appilBoard");
        } else if (boardVO.getBoardField().equals("후기")) {
            rttr.addAttribute("boardNum", boardVO.getBoardNum());
            rttr.addAttribute("boardField", boardVO.getBoardField());
            return new RedirectView("/board/reviewBoard");
        }

        rttr.addAttribute("boardNum", boardVO.getBoardNum());
        rttr.addAttribute("boardField",boardVO.getBoardField());
        return new RedirectView("/board/appilBoard");
    }

    //    삭제
    @PostMapping("appilBoardDelete")
    public String boardDelete(Integer boardNum, Criteria criteria, Model model,BoardVO boardVO){
        log.info("----------------------------");
        log.info("remove............. : " + boardNum);
        log.info("----------------------------");

        boardService.boardDelete(boardNum);
        return getList(boardVO, criteria, model);
    }
}

