package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.Criteria;
import com.example.kovengerss.domain.vo.ReplyDTO;
import com.example.kovengerss.domain.vo.ReplyVO;
import com.example.kovengerss.domain.vo.UserVO;
import com.example.kovengerss.mapper.ReplyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReplyDAO {
    private final ReplyMapper replyMapper;

    //    댓글 등록
    public void register(ReplyVO replyVO){
        replyMapper.insert(replyVO);
    }
    //    댓글 1개 조회
    public ReplyVO read(Integer replyNum){
        return replyMapper.select(replyNum);
    }
    //    댓글 삭제
    public void remove(Integer replyNum){
        replyMapper.delete(replyNum);
    }
    //    댓글 수정
    public void modify(ReplyVO replyVO){
        replyMapper.update(replyVO);
    }
    //    댓글 목록
    public List<ReplyDTO> getList(Criteria criteria, Integer boardNum){
        return replyMapper.getList(criteria, boardNum);
    }
    //    댓글 개수
    public int getTotal(Integer boardNum){
        return replyMapper.getTotal(boardNum);
    }
    // 댓글 작성한 유저의 이름
    public UserVO getUserName(ReplyVO replyVO){
        return replyMapper.getUserName(replyVO);
    }

    //유저번호 가져오기
    public Integer getUserNum(Integer replyNum){
        return replyMapper.getUserNum(replyNum);
    }

    //댓글 갯수 채우기
    public Integer getReplyCount(Integer boardNum){return replyMapper.getReplyCount(boardNum);}
}
