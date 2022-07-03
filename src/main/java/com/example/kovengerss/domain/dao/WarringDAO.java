package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.LikeVO;
import com.example.kovengerss.domain.vo.WarringVO;
import com.example.kovengerss.mapper.LikeMapper;
import com.example.kovengerss.mapper.WarringMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class WarringDAO {

    private final WarringMapper warringMapper;

    //신고 갯수 조회
    public Integer warringCount(Integer boardNum){
        return warringMapper.warringCount(boardNum);
    }
    //신고 누르면 insert 신고 +1
    public void warringInsert(WarringVO warringVO){
        warringMapper.warringInsert(warringVO);
    }
    //신고 누르면 delete 신고 취소 -1
    public void warringDown(WarringVO warringVO){
        warringMapper.warringDown(warringVO);
    }
    //해당 신고 게시판 신고갯수 업데이트
    public boolean CountUp(Integer boardNum){return warringMapper.CountUp(boardNum) == 1;}
}
