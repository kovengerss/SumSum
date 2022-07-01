package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.BoardService;
import com.example.kovengerss.domain.service.PointService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@Slf4j
@RequiredArgsConstructor
public class PointController {
    private final PointService pointService;


    //포인트 결제
    @PostMapping("myPagePoint")
    public void payPoint(){

    }

    @PostMapping("point/success")
    @ResponseBody
    public Object pointSuccess(@RequestBody Map<String, Object> map) {
        map.put("userNum", map.get("userNum"));
        map.put("point", map.get("point"));
        pointService.pointSuccess(map);
        return map;
    }

}
