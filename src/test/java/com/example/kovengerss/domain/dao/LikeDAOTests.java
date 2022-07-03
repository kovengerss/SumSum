package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.LikeVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class LikeDAOTests {
    @Autowired
    private LikeDAO likeDAO;

    @Test
    public void test(){
        log.info("정보 나오라: " + likeDAO.CountUp(6628));
        likeDAO.CountUp(6628);
    }
}
