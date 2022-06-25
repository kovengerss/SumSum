package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.vo.IdealVO;
import com.example.kovengerss.mapper.IdealMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class IdealMapperTests {
    @Autowired
    private IdealMapper idealMapper;

    /*@Test
    public void insert(){
        IdealVO idealVO = new IdealVO();
        idealVO.setAge(28);
        idealVO.setGender("남자");
        idealVO.setHobby("축구");
        idealVO.setResidence("잠실");
        idealVO.setMbti("infp");
        idealVO.setIncome(1222222);
        idealVO.setSelfIntroduce("a2323aaaa");
        idealVO.setHouseExist("sdfsd34f");
        idealVO.setIdealContent("sddsd");
        idealVO.setSmoke("비흡연");
        idealVO.setJob("개발자");

        idealMapper.insert(idealVO);

    }*/

    /*@Test
    public void selectone(){

        idealMapper.select(57);
        log.info(  idealMapper.select(57).toString());

    }*/

   /* @Test
    public void updateTest(){
        IdealVO idealVO = idealMapper.select(5);
        idealVO.setAge(44);
        idealVO.setGender("중성h");
        idealVO.setHobby("없음");
        idealVO.setResidence("제주도");
        idealVO.setMbti("infp");
        idealVO.setIncome("12222222");
        idealVO.setSelfIntroduce("a2323aaaa");
        idealVO.setHouseExist("sdfsd34f");
        idealVO.setIdealContent("sddsd");
        idealVO.setSmoke("비흡연평생");
        idealVO.setJob("개발자");

        log.info("업데이트 성공시 1 ---> "+ idealMapper.update(idealVO));
    }*/
 @Test
    public void getListTest(){
        idealMapper.getList().stream().map(IdealVO::toString).forEach(log::info);
    }
}
