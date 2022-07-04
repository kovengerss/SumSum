package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.vo.WarringVO;
import com.example.kovengerss.mapper.WarringMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class WarringMapperTests {
    @Autowired
    private WarringMapper warringMapper;

//    @Test
//    public void insertTest(){
//        WarringVO warringVO = new WarringVO();
//
//        warringVO.setUserNum(2);
//        warringVO.setBoardNum(6628);
//
//        warringMapper.warringInsert(warringVO);
//    }

//    @Test
//    public void CountTest(){
//            warringMapper.warringCount(6628);
//    }

//        @Test
//    public void DelteTest(){
//            WarringVO warringVO = new WarringVO();
//            warringVO.setBoardNum(6628);
//            warringVO.setUserNum(2);
//        warringMapper.warringDown(warringVO);
//    }
        @Test
    public void test1(){
        warringMapper.CountUp(6628);
    }

}
