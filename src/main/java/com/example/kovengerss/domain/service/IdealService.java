package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.IdealVO;
import org.springframework.stereotype.Service;

@Service
public interface IdealService {
    //이상형 작성
    public void idealInsert(IdealVO idealVO);
    //이상형 수정 작업 (delete -> insert);
    public void idealDelete(IdealVO idealVO);
    //이상형 update 수정작업
    public boolean idealUpdate(IdealVO idealVO);
    //이상형  전제 정보 조회
    public IdealVO idealSelect(int idealNum);
    //AGE조회
    public void idealGetAge(IdealVO idealVO);
    //GENDER조회
    public void idealGetGender(IdealVO idealVO);
    //Hobby조회
    public void idealGetHobby(IdealVO idealVO);
    //Residence조회
    public void idealGetResidence(IdealVO idealVO);
    //MBTI조회
    public void idealGetMbti(IdealVO idealVO);
    //Income조회
    public void idealGetIncome(IdealVO idealVO);
    //SelfIntroduce조회
    public void idealGetSelfIntroduce(IdealVO idealVO);
    //HouseExist조회
    public void idealGetHouseExist(IdealVO idealVO);
    //해당 이상형 정보에 해당하는 userNum조회
    public void idealGetUserNum(IdealVO idealVO);
}
