package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.domain.vo.ReplyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReplyMapper {
    //    댓글 등록
    public void insert(ReplyVO replyVO);
    //    댓글 1개 조회
    public ReplyVO select(Integer replyNum);
    //    댓글 삭제
    public void delete(Integer replyNum);
    //    댓글 수정
    public void update(ReplyVO replyVO);
    //    댓글 목록
    public List<ReplyVO> getList(@Param("criteria") Criteria criteria, @Param("boardNum") Integer boardNum);
    //    댓글 개수
    public int getTotal(Integer boardNum);
//    이름가져오기
    public void getUserName(Integer userNum);

}