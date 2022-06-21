package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.BlackListVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlackListMapper {
    //블랙리스트 명단 추가
    public void insert(BlackListVO blackListVO);
    //블랙리스트 명단 삭제
    public void delete(BlackListVO blackListVO);
    //블랙리스트 전체 목록 보기
    public List<BlackListVO> getList();
    //블랙리스트 한개 가져오기
    public BlackListVO getOne(Integer blackListNum);
    //블랙리스트 전체 개수
    public void getTotal();
}
