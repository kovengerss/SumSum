package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.LikeService;
import com.example.kovengerss.domain.vo.LikeVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/like/*")
@RestController
public class LikeController {
    private final LikeService likeService;

    //버튼 누르면 db에 올라감
    @PostMapping(value="/heart", consumes="application/json" )
    public ResponseEntity<String> likeInsert(@RequestBody LikeVO likeVO)throws UnsupportedEncodingException {
        log.info("-------" + likeVO);
        likeService.likeInsert(likeVO);

        return new ResponseEntity<>(new String("하트버튼 성공".getBytes(), "UTF-8"), HttpStatus.OK);
    }

    //카운트 가져오기
    @GetMapping("/count/{boardNum}")
    public Integer getTotal(@PathVariable("boardNum") Integer boardNum){
        likeService.likeCount(boardNum);
        return likeService.likeCount(boardNum);
    }

    //하트 삭제
    @DeleteMapping("{boardNum}/{userNum}")
    public String heartDown(@PathVariable Integer boardNum,@PathVariable Integer userNum){
        LikeVO likeVO = new LikeVO();
        likeVO.setUserNum(userNum);
        likeVO.setBoardNum(boardNum);
        likeService.likeDown(likeVO);

        return "하트 감소";
    }

}

