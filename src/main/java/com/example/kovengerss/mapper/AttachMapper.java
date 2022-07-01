package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.AttachFileVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AttachMapper {
    public void insert(AttachFileVO attachFileVO);
    public List<AttachFileVO> select(int idealNum);
    public void delete(int idealNum);
}
