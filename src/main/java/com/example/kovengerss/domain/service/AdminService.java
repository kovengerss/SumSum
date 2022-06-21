package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.AdminVO;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.UserVO;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    //관리자 회원가입
    public void adminInsert(AdminVO adminVO);
    //게시글 삭제
    public void adminDeleteBoard(BoardVO boardVO);
    //게시글 수정
    public void adminUpdateBoard(BoardVO boardVO);
    //게시글 신고횟수 조회
    public void adminGetWarningCount(BoardVO boardVO);
    //회원 탈퇴
    public void adminDeleteUser(UserVO userVO);
}
