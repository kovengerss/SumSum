package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.WarringService;
import com.example.kovengerss.domain.vo.WarringVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/warring/*")
@RestController
public class WarringController {
    private final WarringService warringService;
    
    @PostMapping(value="/warring", consumes="application/json" )
    public ResponseEntity<String> warringInsert(@RequestBody WarringVO warringVO)throws UnsupportedEncodingException {
        log.info("-------" + warringVO);
        warringService.warringInsert(warringVO);

        return new ResponseEntity<>(new String("신고버튼 성공".getBytes(), "UTF-8"), HttpStatus.OK);
    }

    //카운트 가져오기
    @GetMapping("/count/{boardNum}")
    public Integer getTotal(@PathVariable("boardNum") Integer boardNum){
        warringService.warringCount(boardNum);
        return warringService.warringCount(boardNum);
    }

    //하트 삭제
    @DeleteMapping("{boardNum}/{userNum}")
    public String heartDown(@PathVariable Integer boardNum,@PathVariable Integer userNum){
        WarringVO warringVO = new WarringVO();
        warringVO.setUserNum(userNum);
        warringVO.setBoardNum(boardNum);
        warringService.warringDown(warringVO);

        return "신고 감소";
    }

    @PostMapping("/warringCount")
    public String CountUp(@RequestBody WarringVO warringVO){
        Integer boardNum = warringVO.getBoardNum();

        warringService.CountUp(boardNum);
        return "신고 카운트 업뎃 성공";
    }

}
