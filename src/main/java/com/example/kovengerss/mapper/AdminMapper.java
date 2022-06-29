package com.example.kovengerss.mapper;


import com.example.kovengerss.domain.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
    public List<BoardVO> getList(@Param("boardVO")BoardVO boardVO, @Param("criteria")Criteria criteria);
    //게시글 목록
    public List<BoardVO> getFieldAppil(@Param("boardVO")BoardVO boardVO, @Param("criteria3")Criteria3 criteria3);
    public List<BoardVO> getFieldBoard(@Param("boardVO")BoardVO boardVO, @Param("criteria2")Criteria2 criteria2);
    public List<BoardVO> getFieldReview(@Param("boardVO")BoardVO boardVO, @Param("criteria1")Criteria1 criteria1);
    //게시글 전체 개수
    public int getTotal(BoardVO boardVO);
    public int getTotalField(BoardVO boardVO);
    public int getWarning(BoardVO boardVO);
    public int getPointTotal(PointVO pointVO);
    //게시글 삭제
    public int delete(Long boardNum);
    //게시글 수정
    public int update(BoardVO boardVO);
    //게시글 한 개 가져오기
    public BoardVO select(Long boardNum);
    //게시글 신고횟수 조회
    public List<BoardVO> getWarningCount(@Param("boardVO")BoardVO boardVO, @Param("criteria")Criteria criteria);
    //회원 탈퇴
    public int deleteUser(int userNum);
    //포인트 조회
    public List<PointVO> getPointList(@Param("PointVO")PointVO pointVO, @Param("criteria")Criteria criteria);
    //포인트 충전
    public int remainPoint(int pointRemain, int userNum);
}
