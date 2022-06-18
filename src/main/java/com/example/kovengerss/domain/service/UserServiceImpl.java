package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.UserDAO;
import com.example.kovengerss.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserDAO userDAO;

    @Override
    public UserVO userSelect(Integer userNum) {
        return null;
    }

    @Override
    public void userInsert(UserVO userVO) {

    }

    @Override
    public void userUpdate(Integer userNum) {

    }

    @Override
    public void userDelete(UserVO userVO) {

    }

    @Override
    public Boolean CheckId(String userId) {
        return null;
    }

    @Override
    public String getId(UserVO userVO) {
        return null;
    }

    @Override
    public String getPw(UserVO userVO) {
        return null;
    }

    @Override
    public String getEmail(UserVO userVO) {
        return null;
    }

    @Override
    public String getPhoneNumber(UserVO userVO) {
        return null;
    }

    @Override
    public String getBirth(UserVO userVO) {
        return null;
    }

    @Override
    public String getGender(UserVO userVO) {
        return null;
    }

    @Override
    public Integer getIdealNum(UserVO userVO) {
        return null;
    }
}
