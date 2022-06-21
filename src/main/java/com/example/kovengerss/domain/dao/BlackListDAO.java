package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.BlackListVO;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.mapper.BlackListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BlackListDAO {
    private final BlackListMapper blackListMapper;

    //블랙리스트 명단 추가
    public void blackInsert(BlackListVO blackListVO){;}
    //블랙리스트 명단 삭제
    public void blackDelete(BlackListVO blackListVO){;}
    //블랙리스트 전체 목록 보기
    public List<BlackListVO> blackGetList(){return blackListMapper.getList();}
    //블랙리스트 한개 가져오기
    public void blackGetOne(Integer blackListNum){;}
    //블랙리스트 전체 개수
    public void blackGetTotal(){;}
}
