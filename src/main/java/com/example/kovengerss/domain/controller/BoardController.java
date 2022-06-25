package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.dao.UserDAO;
import com.example.kovengerss.domain.service.BoardService;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.domain.vo.PageDTO;
import com.example.kovengerss.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/board/*")
public class BoardController {
    private final BoardService boardService;
//     글 목록
    @GetMapping("boardList")
    public String getList(BoardVO boardVO, Criteria criteria,Model model){
        log.info("----------------------------");
        log.info("list.............");
        log.info("----------------------------");
        boardVO.setBoardField("고민상담");
        model.addAttribute("boardList", boardService.getList(boardVO,criteria));
        model.addAttribute("pageDTO", new PageDTO(criteria, boardService.boardGetTotal(boardVO)));
        return "/board/boardList";
    }

    @GetMapping("boardWrite")
    public void boardInsert(){;}


    // 글 작성
    @PostMapping("boardWrite")
    public RedirectView boardInsert( BoardVO boardVO, RedirectAttributes rttr, HttpServletRequest req){
        log.info("----------------------------");
        log.info("write.............");
        log.info("----------------------------");
        HttpSession session = req.getSession();
        Integer userNum = (Integer)session.getAttribute("userNum");

        boardVO.setUserNum(userNum);
        boardService.boardInsert(boardVO);

        rttr.addFlashAttribute("boardNum", boardVO.getBoardNum());
        rttr.addFlashAttribute("boardField",boardVO.getBoardField());

        return new RedirectView("/board/boardList");
    }

    @GetMapping({"board","boardUpdate"})
    public void boardSelectOne(BoardVO boardVO,Integer boardNum,Model model,HttpServletRequest req){

        log.info("----------------------------");
        log.info(req.getRequestURI() + "............. : " + boardNum);
        log.info("----------------------------");

        boardService.boardSelectOne(boardNum);
        model.addAttribute("board",boardService.boardSelectOne(boardNum));
    }


    //수정
    @PostMapping("boardUpdate")
    public RedirectView boardUpdate(BoardVO boardVO, RedirectAttributes rttr,HttpServletRequest req){
        log.info("----------------------------");
        log.info("보드 넘버 " +boardVO.getBoardNum());
        log.info("----------------------------");

        HttpSession session = req.getSession();
        Integer userNum = (Integer) session.getAttribute("userNum");

        boardVO.setUserNum(userNum);
        boardService.boardUpdate(boardVO);
        rttr.addAttribute("boardNum", boardVO.getBoardNum());
        rttr.addAttribute("boardField",boardVO.getBoardField());
        return new RedirectView("/board/board");
    }
}