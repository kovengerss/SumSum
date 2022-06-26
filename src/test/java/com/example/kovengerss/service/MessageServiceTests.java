package com.example.kovengerss.service;

import com.example.kovengerss.domain.service.IdealService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@Slf4j
public class MessageServiceTests {
    //    마치 브라우저에서 URL을 요청한 것처럼 환경을 만들어준다.
    private MockMvc mockMvc;

    @Autowired
//    요청을 처리해주는 WebApplicationContext를 불러온다.
    private WebApplicationContext webApplicationContext;

    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    public void readTest() throws Exception{
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/getMyIdeal").param("idealNum", "167")).andReturn().getModelAndView().getModelMap().toString());
    }
}
