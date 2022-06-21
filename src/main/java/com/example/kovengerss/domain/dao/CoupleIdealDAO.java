package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.CoupleIdealVO;
import com.example.kovengerss.mapper.CoupleIdealMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CoupleIdealDAO {
    private final CoupleIdealMapper coupleIdealMapper;

    //이상형 작성
    public void coupleInsert(CoupleIdealVO coupleIdealVO){;}
    //이상형 수정 작업 (delete -> insert);
    public void coupleDelete(CoupleIdealVO coupleIdealVO){;}
    //이상형 update 수정작업
    public void coupleUpdate(CoupleIdealVO coupleIdealVO){;}
    //이상형 전제 정보 조회
    public void coupleSelect(CoupleIdealVO coupleIdealVO){;}
    //AGE조회
    public void coupleGetAge(CoupleIdealVO coupleIdealVO){;}
    //GENDER조회
    public void coupleGetGender(CoupleIdealVO coupleIdealVO){;}
    //Hobby조회
    public void coupleGetHobby(CoupleIdealVO coupleIdealVO){;}
    //Residence조회
    public void coupleGetResidence(CoupleIdealVO coupleIdealVO){;}
    //MBTI조회
    public void coupleGetMbti(CoupleIdealVO coupleIdealVO){;}
    //SelfIntroduce조회
    public void coupleGetSelfIntroduce(CoupleIdealVO coupleIdealVO){;}
    //해당 이상형 정보에 해당하는 userNum조회
    public void coupleGetUserNum(CoupleIdealVO coupleIdealVO){;}
}
