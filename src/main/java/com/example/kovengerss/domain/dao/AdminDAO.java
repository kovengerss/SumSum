package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.*;
import com.example.kovengerss.mapper.AdminMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
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
    //유저 목록
    public List<UserVO> getUserList(UserVO userVO, Criteria criteria){return adminMapper.userList(userVO, criteria);}
    //유저 수
    public int getTotalUser(UserVO userVO){return adminMapper.getTotalUser(userVO);}
    //게시글 목록
    public List<BoardVO> getList(Criteria criteria){return adminMapper.getList(criteria);}
    public List<BoardVO> getFieldAppil(BoardVO boardVO, Criteria3 criteria3){return adminMapper.getFieldAppil(boardVO, criteria3);}
    public List<BoardVO> getFieldBoard(BoardVO boardVO, Criteria2 criteria2){return adminMapper.getFieldBoard(boardVO, criteria2);}
    public List<BoardVO> getFieldReview(BoardVO boardVO, Criteria1 criteria1){return adminMapper.getFieldReview(boardVO, criteria1);}

    public List<PointVO> getPointList(PointVO pointVO, Criteria criteria){return adminMapper.getPointList(pointVO, criteria);}
    //게시글 전체 개수
    public int boardGetTotal(Criteria criteria){return adminMapper.getTotal(criteria);}

    public int boardGetTotalField(BoardVO boardVO){return adminMapper.getTotalField(boardVO);}

    public int boardGetWarning(BoardVO boardVO){return adminMapper.getWarning(boardVO);}
    //포인트 개수
    public int getPointTotal(PointVO pointVO){return adminMapper.getPointTotal(pointVO);}
    //게시글 한 개 가져오기
    public BoardVO findByBoardNumber(Long boardNum){
        return adminMapper.select(boardNum);
    }
    //유저 이상형 정보 한 개 가져오기
    public IdealVO getIdeal(int userNum){
        return adminMapper.ideal(userNum);
    }
    //게시글 삭제
    public boolean boardDelete(Long boardNum){
        return adminMapper.delete(boardNum) ==1;
    }
    //게시글 신고 횟수 조회
    public List<BoardVO> getCount(BoardVO boardVO, Criteria criteria){
        return adminMapper.getWarningCount(boardVO, criteria);
    }
    //회원 탈퇴
    public boolean deleteUser(int userNum){
        return adminMapper.deleteUser(userNum) == 1;
    }
    //포인트 충전
    public int getPoint(int userNum){return adminMapper.remainPoint(userNum);}
}
