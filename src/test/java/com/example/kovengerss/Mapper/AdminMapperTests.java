package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.dao.AdminDAO;
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

    @Test
    public void adminLogin(){
        adminDAO.adminLogin("admin", "1234");
    }

}
