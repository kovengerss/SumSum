package com.example.kovengerss.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;

@Slf4j
public class BoardControllerTests {
//    마치 브라우저에서 URL을 요청한 것처럼 환경을 만들어준다.
   // private MockMvc mockMvc;

    @Autowired
//    요청을 처리해주는 WebApplicationContext를 불러온다.
    private WebApplicationContext webApplicationContext;

    /*@BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void getListTest() throws Exception {
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/boardList")).andReturn().getModelAndView().getModelMap().toString());
    }


     */
//    @Test
//    public void getListTest() throws Exception {
//        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/appilBoardList")).andReturn().getModelAndView().getModelMap().toString());
//    }
//    @Test
//    public void registerTest() throws Exception {
//        log.info(mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
//                .param("boardTitle", "테스트 새 글 제목")
//                .param("boardContent", "테스트 새 글 내용")
//                .param("boardWriter", "hds1234")).andReturn().getFlashMap().toString());
//    }

//    @Test
//    public void readTest() throws Exception{
//        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/board").param("boardNum","6405").param("boardField","고민상담")).andReturn().getModelAndView().getModelMap().toString());
//    }

//    @Test
//    public void modifyTest() throws Exception {
//        log.info(mockMvc.perform(MockMvcRequestBuilders.post("/board/boardUpdate")
//                .param("boardNum", "6405")
//                .param("boardTitle", "수정된 게시글 제목")
//                .param("boardField","후기")
//                .param("boardContent", "수정된 게시글 내용")).andReturn().getModelAndView().getModelMap().toString());
//    }

//    @Test
//    public void removeTest() throws Exception {
//        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/remove").param("boardNumber", "2601")).andReturn().getModelAndView().getViewName());
//    }

}


















