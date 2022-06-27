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
public class ReviewBoardController {
    private final BoardService boardService;

    //     글 목록
    @GetMapping("reviewBoardList")
    public String getList(BoardVO boardVO, Criteria criteria, Model model){
        log.info("----------------------------");
        log.info("list.............");
        log.info("----------------------------");
        boardVO.setBoardField("후기");
        model.addAttribute("reviewBoardList", boardService.getList(boardVO,criteria));
        model.addAttribute("pageDTO", new PageDTO(criteria, boardService.boardGetTotal(boardVO)));
        return "/board/reviewBoardList";
    }

    @GetMapping({"reviewBoard","reviewBoardUpdate"})
    public void boardSelectOne(BoardVO boardVO, Integer boardNum, Model model, HttpServletRequest req){

        log.info("----------------------------");
        log.info(req.getRequestURI() + "............. : " + boardNum);
        log.info("----------------------------");

        boardService.boardSelectOne(boardNum);
        model.addAttribute("reviewBoard",boardService.boardSelectOne(boardNum));
    }


    //수정
    @PostMapping("reviewBoardUpdate")
    public RedirectView boardUpdate(BoardVO boardVO, RedirectAttributes rttr, HttpServletRequest req){

        log.info("-----------");
        log.info("보드 넘버" + boardVO.getBoardNum());

        HttpSession session = req.getSession();
        Integer userNum = (Integer) session.getAttribute("userNum");

        boardVO.setUserNum(userNum);
        boardService.boardUpdate(boardVO);
        rttr.addAttribute("boardNum", boardVO.getBoardNum());
        rttr.addAttribute("boardField",boardVO.getBoardField());
        return new RedirectView("/board/reviewBoard");
    }

    //    삭제
    @PostMapping("reviewBoardDelete")
    public String boardDelete(Integer boardNum, Criteria criteria, Model model,BoardVO boardVO){
        log.info("----------------------------");
        log.info("remove............. : " + boardNum);
        log.info("----------------------------");

        boardService.boardDelete(boardNum);
        return getList(boardVO, criteria, model);
    }

}
