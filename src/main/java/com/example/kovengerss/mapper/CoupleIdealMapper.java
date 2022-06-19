package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.CoupleIdealVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CoupleIdealMapper {
    //이상형 작성
    public void insert(CoupleIdealVO coupleIdealVO);
    //이상형 수정 작업 (delete -> insert);
    public void delete(CoupleIdealVO coupleIdealVO);
    //이상형 update 수정작업
    public void update(CoupleIdealVO coupleIdealVO);
    //이상형 전제 정보 조회
    public CoupleIdealVO select(CoupleIdealVO coupleIdealVO);
    //AGE조회
    public Integer getAge(CoupleIdealVO coupleIdealVO);
    //GENDER조회
    public String getGender(CoupleIdealVO coupleIdealVO);
    //Hobby조회
    public String getHobby(CoupleIdealVO coupleIdealVO);
    //Residence조회
    public String getResidence(CoupleIdealVO coupleIdealVO);
    //MBTI조회
    public String getMbti(CoupleIdealVO coupleIdealVO);
    //SelfIntroduce조회
    public String getSelfIntroduce(CoupleIdealVO coupleIdealVO);
    //해당 이상형 정보에 해당하는 userNum조회
    public Integer getUserNum(CoupleIdealVO coupleIdealVO);

}
