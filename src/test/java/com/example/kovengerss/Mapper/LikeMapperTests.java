package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.vo.LikeVO;
import com.example.kovengerss.mapper.LikeMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class LikeMapperTests {
    @Autowired
    private LikeMapper likeMapper;

    @Test
    public void heartUpTests(){
        LikeVO likeVO = new LikeVO();
        likeVO.setBoardNum(6523);
        likeVO.setUserNum(2);
        likeVO.setLikeCheck(0);

        likeMapper.insert(likeVO);
    }
}
