package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.ReplyService;
import com.example.kovengerss.domain.vo.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/reply/*")
@RequiredArgsConstructor
public class ReplyController {
    private final ReplyService replyService;

//    댓글 등록
    @PostMapping(value="/new", consumes="application/json", produces ="text/plain; charset=utf-8")
    public ResponseEntity<String> create(@RequestBody ReplyVO replyVO) throws UnsupportedEncodingException{
        log.info("replyVO : " + replyVO);
        replyService.register(replyVO);
        return new ResponseEntity<>(new String("댓글등록 성공".getBytes(), "UTF-8"), HttpStatus.OK);
    }

    @GetMapping("/{replyNum}")
    public ReplyVO read(@PathVariable("replyNum") Integer replyNum){
        log.info("read..... : " + replyNum);
        return replyService.read(replyNum);
    }

    @GetMapping("/list/{boardNum}/{page}")
    public ReplyPageDTO getList(@PathVariable("page") Integer pageNum, @PathVariable("boardNum") Integer boardNum){
        return new ReplyPageDTO(replyService.getList(new Criteria(pageNum, 5), boardNum), replyService.getTotal(boardNum));
    }

    @DeleteMapping("/{replyNum}")
    public String remove(@PathVariable("replyNum") Integer replyNum){
        replyService.remove(replyNum);
        return "댓글 삭제 성공";
    }

    @PutMapping("/{replyNum}")
    public String modify(@PathVariable("replyNum") Integer replyNum, @RequestBody ReplyVO replyVO){
        log.info("modify............... : " + replyNum);
        log.info(replyVO.toString());

        replyVO.setReplyNum(replyNum);
        replyService.modify(replyVO);

        return replyService.read(replyNum) == null ? "댓글 수정 실패" : "댓글 수정 성공";
    }

    @GetMapping("/total/{boardNum}")
    public Integer getTotal(@PathVariable("boardNum") Integer boardNum){
        replyService.getTotal(boardNum);
        return replyService.getTotal(boardNum);
    }


    @GetMapping("/num/{replyNum}")
    public Integer userNum(@PathVariable("replyNum") Integer replyNum){
        log.info("댓글 번호 : " +replyNum);
        log.info("유저 번호 22222: " + replyService.getUserNum(replyNum));
        return replyService.getUserNum(replyNum);
    }

    @GetMapping("/name/{replyNum}")
    public String getUserName(@PathVariable("replyNum") Integer replyNum){
        ReplyVO replyVO = new ReplyVO();
        Integer userNum = replyService.getUserNum(replyNum);
        replyVO.setUserNum(userNum);

        log.info("이름 : " + replyService.getUserName(replyVO).getUserName());
        return replyService.getUserName(replyVO).getUserName();
    }

    @PostMapping("/replyCount")
    public String getReplyCount(@RequestBody ReplyVO replyVO){
        Integer boardNum = replyVO.getBoardNum();
        replyService.getReplyCount(boardNum);
        return "댓글 갯수 넣기 성공";
    }


}
