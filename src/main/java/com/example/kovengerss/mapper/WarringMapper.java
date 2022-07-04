package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.WarringVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WarringMapper {

        //  게시판 신고 총 갯수
        public Integer warringCount(Integer boardNum);
        //  신고 갯수 추가
        public void warringInsert(WarringVO warringVO);
        //  신고 갯수 감소
        public void warringDown(WarringVO warringVO);

        public Integer CountUp(Integer boardNum);
}
