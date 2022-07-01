package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.LikeVO;
import com.example.kovengerss.mapper.LikeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LikeDAO {
    private final LikeMapper likeMapper;

    //좋아요 갯수 조회
    public Integer likeCount(Integer boardNum){
        return likeMapper.likeCount(boardNum);
    }
    //좋아요 누르면 insert 좋아요 +1
    public void likeInsert(LikeVO likeVO){
        likeMapper.likeInsert(likeVO);
    }
    //좋아요 누르면 delete 좋아요 취소 -1
    public void likeDown(LikeVO likeVO){
        likeMapper.likeDown(likeVO);
    }
    //해당 좋아요 게시판 글 번호(boardnum) 조회
    public boolean userCheck(LikeVO likeVO){
        return likeMapper.userCheck(likeVO) == 1;
    }
    //해당 게시판 좋아요 눌럿는지 확인
}
