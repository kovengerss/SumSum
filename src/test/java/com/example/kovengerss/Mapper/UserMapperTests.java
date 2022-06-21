package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.dao.UserDAO;
import com.example.kovengerss.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDAO userDAO;

    @Test
    public void select(){
        log.info(userMapper.select(26).toString());
    }

    /*@Test
    public void insert(){
        UserVO userVO = new UserVO();
        userVO.setUserEmail("whddla8912@naver.com");
        userVO.setUserPw("1234");
        userVO.setUserBirth("981228");
        userVO.setUserPhoneNumber("01050118912");
        userVO.setUserId("whddla8912");
        userVO.setUserGender("M");
        userVO.setUserName("wwM");
        userMapper.insert(userVO);
    }*/

    /*@Test
    private void check(){
        UserVO userVO = new UserVO();
        userDAO.userInsert(userVO.setUserEmail("whddla8923@naver.com"));
    }*/

    /*@Test
    public void getId(){
        log.info(userMapper.getId("whddla2").toString());
    }*/


}
