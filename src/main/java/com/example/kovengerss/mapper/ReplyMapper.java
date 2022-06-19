package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.ReplyVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReplyMapper {

    //게시글 답글 작성
    public void insert(ReplyVO replyVO);
    //게시글  답글 한개 가져오기
    public ReplyVO select(Integer replyNum);
    //게시글 답글 수정
    public void update(ReplyVO replyVO);
    //게시글 답글 삭제
    public void delete(ReplyVO replyVO);
    //답글 시간 가져오기
    public String getRegisterDate();
    //게시글 수정 시간 가져오기
    public String getUpdateDate();
    //게시글에 달린 총 답글 갯수
    public Integer getTotal();
    //게시글 답글 내용 가져오기
    public String getContent(ReplyVO replyVO);
}
