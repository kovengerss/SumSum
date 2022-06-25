package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.IdealVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IdealMapper {
    //이상형 작성
    public void insert(IdealVO idealVO);
    //이상형 수정 작업 (delete -> insert);
    public int delete(IdealVO idealVO);
    //이상형  전제 정보 조회
    public IdealVO select(Integer idealNum);
    //이상형 update 수정작업
    public int update(IdealVO idealVO);

    //이상형 목록 조회
    public List<IdealVO> getList();
    //AGE조회
    public Integer getAge(IdealVO idealVO);
    //GENDER조회
    public String getGender(IdealVO idealVO);
    //Hobby조회
    public String getHobby(IdealVO idealVO);
    //Residence조회
    public String getResidence(IdealVO idealVO);
    //MBTI조회
    public String getMbti(IdealVO idealVO);
    //Income조회
    public Integer getIncome(IdealVO idealVO);
    //SelfIntroduce조회
    public String getSelfIntroduce(IdealVO idealVO);
    //HouseExist조회
    public String getHouseExist(IdealVO idealVO);
    //해당 이상형 정보에 해당하는 userNum조회
    public Integer getUserNum(IdealVO idealVO);

}
