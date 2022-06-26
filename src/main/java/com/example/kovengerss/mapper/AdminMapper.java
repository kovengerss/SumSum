package com.example.kovengerss.mapper;


import com.example.kovengerss.domain.vo.AdminVO;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    //관리자 회원가입
    public void insert(AdminVO adminVO);
    //관리자 로그인
    public AdminVO adminLogin(String adminId, String adminPw);
    //유저아이디
    public String getUserId(int userNum);
    //게시글 목록
    public List<BoardVO> getList(Criteria criteria);
    //게시글 삭제
    public int delete(int boardNum);
    //게시글 수정
    public int update(BoardVO boardVO);
    //게시글 신고횟수 조회
    public int getWarningCount(int boardNum);
    //회원 탈퇴
    public int deleteUser(int userNum);
}
