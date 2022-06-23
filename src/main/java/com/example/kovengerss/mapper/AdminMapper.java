package com.example.kovengerss.mapper;


import com.example.kovengerss.domain.vo.AdminVO;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    //관리자 회원가입
    public void insert(AdminVO adminVO);
    //관리자 로그인
    public AdminVO adminLogin(String adminId, String adminPw);
    //게시글 삭제
    public void deleteBoard(BoardVO boardVO);
    //게시글 수정
    public void updateBoard(BoardVO boardVO);
    //게시글 신고횟수 조회
    public int getWarningCount(BoardVO boardVO);
    //회원 탈퇴
    public void deleteUser(UserVO userVO);
}
