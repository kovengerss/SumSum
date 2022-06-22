package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.dao.UserDAO;
import com.example.kovengerss.domain.vo.UserVO;
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

    /*@Test
    public void select(){
        log.info(userMapper.select(26).toString());
    }
    */
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
//    아이디 가져오기
    public void getId(){
        UserVO userVO = new UserVO();
        log.info(userMapper.getId("whddla1").toString());
    }*/

    /*@Test
    public void checkId(){
        userMapper.checkId("whddla123");
    }*/
    /*@Test
    public void checkId(){
        userDAO.CheckId("whddla1234");
    }*/

    /*@Test
    public void login(){
        userMapper.login("whddla123", "1234");
    }*/

    /*@Test
    public void login(){
        userDAO.login("whddla123","1234");
    }*/
}
