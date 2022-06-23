package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.AdminVO;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.UserVO;
import com.example.kovengerss.mapper.AdminMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

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

    //게시글 삭제
    public void adminDeleteBoard(BoardVO boardVO){;}
    //게시글 수정
    public void adminUpdateBoard(BoardVO boardVO){;}
    //게시글 신고 횟수 조회
    public void adminGetWarningCount(BoardVO boardVO){;}
    //회원 탈퇴
    public void adminDeleteUser(UserVO userVO){;}
}
