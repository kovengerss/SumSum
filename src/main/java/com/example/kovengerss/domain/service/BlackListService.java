package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.BlackListVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlackListService {
    //블랙리스트 명단 추가
    public void blackInsert(BlackListVO blackListVO);
    //블랙리스트 명단 삭제
    public void blackDelete(BlackListVO blackListVO);
    //블랙리스트 전체 목록 보기
    public List<BlackListVO> blackGetList();
    //블랙리스트 한개 가져오기
    public void blackGetOne(Integer blackListNum);
    //블랙리스트 전체 개수
    public void blackGetTotal();
}
