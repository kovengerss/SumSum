package com.example.kovengerss.Mapper;

import com.example.kovengerss.domain.vo.AttachFileVO;
import com.example.kovengerss.domain.vo.IdealVO;
import com.example.kovengerss.mapper.AttachMapper;
import com.example.kovengerss.mapper.IdealMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class AttachMapperTests {
    @Autowired
    private AttachMapper attachMapper;

    @Autowired
    private IdealMapper idealMapper;

/*    @Test
    public void insertTest(){
        IdealVO idealVO = idealMapper.select(28);
        AttachFileVO attachFileVO = new AttachFileVO();
        attachFileVO.setFileName("uuid_테스트.txt");
        attachFileVO.setOriginalFileName("테스트.txt");
       attachFileVO.setUploadDirectory("2022/06/30");
          attachFileVO.setImage(false);
       attachFileVO.setIdealVO(idealVO);

        attachMapper.insert(attachFileVO);
    }*/

    /*@Test
    public void selectTest(){
        attachMapper.select(28).stream().map(fileVO -> fileVO.getFileName()).forEach(log::info);
    }

     */
}
