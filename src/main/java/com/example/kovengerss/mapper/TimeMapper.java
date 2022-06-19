package com.example.kovengerss.mapper;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TimeMapper {  /* 단위테스트 시험용 mapperInterface 저희 sumsum프로젝트와 관련없습니다*/

    public String getTime();
}
