package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BoardMapperTests {
    @Autowired
    private BoardMapper boardMapper;
    @Test
    public void getListTest(){
        boardMapper.getList().stream().map(BoardVO::toString).forEach(log::info);
    }
}
