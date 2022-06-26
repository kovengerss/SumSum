package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.dao.AdminDAO;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.mapper.AdminMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AdminMapperTests {
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminDAO adminDAO;

    /*@Test
    public void adminLogin(){
        adminMapper.adminLogin("admin","1234");
    }*/

    /*@Test
    public void adminLogin(){
        adminDAO.adminLogin("admin", "1234");
    }*/

    /*@Test
    public void test1(){
        adminMapper.getList();
    }*/

    /*@Test
    public void test2(){
        adminMapper.delete(2);
    }*/

    /*@Test
    public void test3(){
        adminMapper.deleteUser(45);
    }*/

    /*@Test
    public void test4(){
        adminDAO.deleteUser(48);
    }*/

    /*@Test
    public void test5(){
        adminDAO.getCount(1);
    }*/
/*
    @Test
    public void test6(){
        adminMapper.getUserId(47);
    }*/

    @Test
    public void test7(){
        adminDAO.getUserId(47);
    }
}
