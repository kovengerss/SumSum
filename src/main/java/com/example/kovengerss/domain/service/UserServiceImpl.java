package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.UserDAO;
import com.example.kovengerss.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Random;

@Service
@RequiredArgsConstructor
@Qualifier("user") @Primary
@Slf4j
public class UserServiceImpl implements UserService{
    private final UserDAO userDAO;
    private final SmsService smsService;

    @Override
    public void userSelect(Integer userNum) {

    }

    @Override
    public void userInsert(UserVO userVO) {
        userDAO.userInsert(userVO);
    }

    @Override
    public void userUpdate(Integer userNum) {

    }

    @Override
    public boolean userDelete(int userNum) {
        return userDAO.userDelete(userNum);
    }

    @Override
    public boolean checkId(String userId) {
        if(userDAO.CheckId(userId)){
            return true;
        }return false;
    }

    @Override
    public UserVO login(String userId, String userPw){
       return userDAO.login(userId, userPw);
    }

    @Override
    public void userGetId(UserVO userVO) {

    }

    @Override
    public void userGetPw(UserVO userVO) {

    }

    @Override
    public void userGetEmail(UserVO userVO) {

    }

    @Override
    public void userGetPhoneNumber(UserVO userVO) {

    }

    @Override
    public void userGetBirth(UserVO userVO) {

    }

    @Override
    public void userGetGender(UserVO userVO) {

    }

    @Override
    public void userGetIdealNum(UserVO userVO) {

    }

    @Override
    public boolean userDeleteByIdAndPw(String userId, String userPw) {
        if(userDAO.checkUserPw(userId, userPw)){
            userDAO.userDeleteWithPw(userPw);
            log.info("userId {} 삭제되었습니다.",userId);
            return true;
        }else{
            log.info("userPw 불일치");
            return  false;
        }
    }

    @Override
    public void sendSms(Map<String, Object> map) {
        String userPhoneNum = (String) map.get("userPhoneNum");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i ++) {
            stringBuilder.append(new Random().nextInt(10));
        }

        // 4자리 인증코드 만들기
        // 인증코드로 smsService호출
        smsService.sendMessage(String.valueOf(stringBuilder), userPhoneNum);

        map.put("authCode", stringBuilder);
        map.put("res", true);
    }

    @Override
    public void findIdSuccess(Map<String, Object> map) {
        String userPhoneNum = (String) map.get("userPhoneNum");

        UserVO userVO = userDAO.findUserByPhoneNum(userPhoneNum);

        map.put("res", true);
        map.put("id", userVO.getUserId());

    }

    @Override
    public void verifySms(String userPhoneNum, String authInput) {

    }


}
