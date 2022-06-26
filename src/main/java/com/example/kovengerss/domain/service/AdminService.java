package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.AdminVO;
import com.example.kovengerss.domain.vo.BoardVO;
import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.domain.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    //관리자 회원가입
//    public void adminInsert(AdminVO adminVO);
    //로그인
    public AdminVO adminLogin(String adminId, String adminPw);
    //유저아이디
    public String getUserId(int userNum);
    //게시글 목록
    public List<BoardVO> getList(Criteria criteria);
    //게시글 삭제
    public boolean remove(int boardNum);
    //게시글 수정
//    public boolean updateBoard(int boardNum);
    //게시글 신고횟수 조회
    public int getCount(int boardNum);
    //회원 탈퇴
    public boolean deleteUser(int userNum);
}
