package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.LikeVO;
import org.springframework.stereotype.Service;

@Service
public interface LikeService {
    //좋아요 갯수 조회
    public void likeSelect(LikeVO likeVO);
    //좋아요 누르면 insert 좋아요 +1
    public void likeInsert(LikeVO likeVO);
    //좋아요 누르면 delete 좋아요 취소 -1
    public void likeDelete(LikeVO likeVO);
    //해당 좋아요 게시판 글 번호(boardnum) 조회
    public void likeGetBoardNum(LikeVO likeVO);
}
