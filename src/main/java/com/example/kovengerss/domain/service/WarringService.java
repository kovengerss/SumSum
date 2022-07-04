package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.LikeVO;
import com.example.kovengerss.domain.vo.WarringVO;
import org.springframework.stereotype.Service;

@Service
public interface WarringService {
    //신고 갯수 조회
    public Integer warringCount(Integer boardNum);
    //신고 누르면 insert 신고 +1
    public void warringInsert(WarringVO warringVO);
    //신고 누르면 delete 신고 취소 -1
    public void warringDown(WarringVO warringVO);

    public boolean CountUp(Integer boardNum);

}
