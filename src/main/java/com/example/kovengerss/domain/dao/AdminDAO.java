package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.AdminVO;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.domain.vo.UserVO;
import com.example.kovengerss.mapper.AdminMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AdminDAO {
    private final AdminMapper adminMapper;

    //관리자 회원가입
    public void adminInsert(AdminVO adminVO){;}

    //로그인
    public AdminVO adminLogin(String adminId, String adminPw) {
        return adminMapper.adminLogin(adminId,adminPw);
    }
    //유저아이디
    public String getUserId(int userNum){
        return adminMapper.getUserId(userNum);
    }
    //게시글 목록
    public List<BoardVO> getList(Criteria criteria){
        return adminMapper.getList(criteria);
    }

    //게시글 삭제
    public boolean remove(int boardNum){
        return adminMapper.delete(boardNum) == 1;
    }
    //게시글 신고 횟수 조회
    public int getCount(int boardNum){
        return adminMapper.getWarningCount(boardNum);
    }
    //회원 탈퇴
    public boolean deleteUser(int userNum){
        return adminMapper.deleteUser(userNum) == 1;
    }
}
