package com.example.kovengerss.Mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserMapperTests2 {
    @Autowired
    private UserMapper userMapper;

//    @Test
//    public void getDelete(){
//        log.info("------------");
//        log.info("삭제 건수 : " + userMapper.delete(1));
//        log.info("------------");
//    }

    @Autowired
    private UserDAO userDAO;

    @Test
    public void getDeleteDao(){
        log.info("------------");
        log.info("삭제 건수 dao: " + userDAO.userDelete(1));
        log.info("------------");
    }
}
