package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.UserVO;
import com.example.kovengerss.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;

    //회원 정보 조회
    public void userSelect(Integer userNum){;}
    //회원가입
    public void userInsert(UserVO userVO){userMapper.insert(userVO);}
    //회원 정보 수정
    public void userUpdate(Integer userNum){;}
    //회원 탈퇴
    public boolean userDelete(int userNum){
        return userMapper.delete(userNum) == 1;
    }
    //아이디 중복검사
    public boolean CheckId(String userId){
        return userMapper.checkId(userId) == true;
    }
    //로그인
    public UserVO login(String userId, String userPw){
        return userMapper.login(userId, userPw);
    }
    //아이디 가져오기
    public void userGetId(String userId){;}
    //현재 비밀번호 가져오기
    public void userGetPw(UserVO userVO){;}
    //이메일 가져오기
    public void userGetEmail(UserVO userVO){;}
    //핸드폰 번호 가져오기
    public void userGetPhoneNumber(UserVO userVO){;}
    //출생년도 가져오기
    public void userGetBirth(UserVO userVO){;}
    //성별 가져오기
    public void userGetGender(UserVO userVO){;}
    //해당 회원 이상형 번호(ideal_num)가져오기
    public void userGetIdealNum(UserVO userVO){;}

    // 회원 탈퇴
    public void userDeleteWithPw(String userPw) {
        userMapper.deleteWithPw(userPw);
    }
    // 회원 비밀번호 확인
    public boolean checkUserPw(String userId, String userPw){
       UserVO userVO = userMapper.checkUserIdAndPw(userId, userPw);
       return userVO == null ? false : true;
    }

    // 회원 폰 번호 확인
    public UserVO findUserByPhoneNum(String userPhoneNum) {
        return userMapper.findUserByPhoneNum(userPhoneNum);
    }

    // 이용자수
    public int countUser() {
        return userMapper.countUser();
    }
    // 회원 이메일 확인
    public UserVO findUserByEmail(String userEmail) {
        return userMapper.findUserByEmail(userEmail);
    }

    // 회원 포인트 확인
    public Integer findUserPoint(Integer userNum) {
        return userMapper.findUserPoint(userNum);
    }
}
