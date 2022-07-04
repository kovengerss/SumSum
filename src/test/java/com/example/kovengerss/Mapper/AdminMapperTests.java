package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.dao.AdminDAO;
import com.example.kovengerss.domain.vo.*;
import com.example.kovengerss.mapper.AdminMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

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

    /*@Test
    public void test7(){
        adminDAO.getUserId(47);
    }*/

    /*@Test
    public void test8(){
        BoardVO boardVO = new BoardVO();
        adminMapper.getTotal(boardVO);
    }*/
    /*@Test
    public void getListTest(){
        BoardVO boardVO = new BoardVO();
        adminMapper.getList(boardVO,new Criteria()).stream().map(BoardVO::toString).forEach(log::info);

    }*/
    /*@Test
    public void getListTest(){
        BoardVO boardVO = new BoardVO();
        boardVO.setBoardField("고민상담");
        adminMapper.getFieldBoard(boardVO,new Criteria2()).stream().map(BoardVO::toString).forEach(log::info);
    }*/
    /*@Test
    public void getList(){
        BoardVO boardVO = new BoardVO();
//        boardVO.setBoardField("후기");
        log.info("------------------------------------"+boardVO.getBoardField()+"-----------------------");
        adminDAO.getCount(boardVO,new Criteria()).stream().map(BoardVO::toString).forEach(log::info);
    }*/
    /*@Test
    public void test(){
        BoardVO boardVO = new BoardVO();
        boardVO.setBoardField("고민상담");
        adminMapper.getTotalField(boardVO);
    }*/
    /*@Test
    public void test(){
        BoardVO boardVO = new BoardVO();
        adminMapper.getWarningCount(boardVO,new Criteria()).stream().map(BoardVO::toString).forEach(log::info);
    }*/

//    @Test void test(){
//        BoardVO boardVO = new BoardVO();
//        adminDAO.boardDelete(57);
//    }

    /*@Test void test(){
        adminMapper.select(1);
    }
*/
    /*@Test
    public void test(){
        PointVO pointVO = new PointVO();
        adminMapper.getPointList(pointVO ,new Criteria()).stream().map(PointVO::toString).forEach(log::info);
    }*/

    @Test
    public void test(){
        PointVO pointVO =new PointVO();
        adminMapper.remainPoint(50000, 54);
    }
}
