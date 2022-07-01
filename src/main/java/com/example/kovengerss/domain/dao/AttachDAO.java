package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.AttachFileVO;
import com.example.kovengerss.mapper.AttachMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AttachDAO {
    private final AttachMapper attachMapper;

    public void save(AttachFileVO attachFileVO){
        attachMapper.insert(attachFileVO);
    }

    public List<AttachFileVO> findByBoardNumber(int idealNum){
        return attachMapper.select(idealNum);
    }

    public void remove(int idealNum){
        attachMapper.delete(idealNum);
    }
}
