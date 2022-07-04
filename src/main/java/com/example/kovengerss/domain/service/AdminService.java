package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.*;
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
    //유저목록
    public List<UserVO> userList(UserVO userVO, Criteria criteria);
    //유저 수
    public int getTotalUser(UserVO userVO);
    //게시글 목록
    public List<BoardVO> getList(Criteria criteria);
    public List<BoardVO> getFieldAppil(BoardVO boardVO, Criteria3 criteria3);
    public List<BoardVO> getFieldBoard(BoardVO boardVO, Criteria2 criteria2);
    public List<BoardVO> getFieldReview(BoardVO boardVO, Criteria1 criteria1);

    public List<PointVO> getPointList(PointVO pointVO, Criteria criteria);
    public List<BoardVO> getCount(BoardVO boardVO, Criteria criteria);
    //게시글 전체 개수
    public int boardGetTotal(Criteria criteria);
    public int boardGetTotalField(BoardVO boardVO);
    public int getPointTotal(PointVO pointVO);
    //게시글 한개조회
    public BoardVO get(Long boardNum);
    //이상형 정보 한개 조회
    public IdealVO getIdeal(int userNum);
    //게시글 신고횟수 조회
    public int boardGetWarning(BoardVO boardVO);
    //게시글 삭제
    public boolean boardDelete(Long boardNum);
    //게시글 수정
//    public boolean updateBoard(int boardNum);

    //회원 탈퇴
    public boolean deleteUser(int userNum);
    //포인트 충전
    public int getPoint(int remainPoint, int userNum);
}
