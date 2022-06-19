package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.AnswerVO;
import com.example.kovengerss.mapper.AnswerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AnswerDAO {
    private final AnswerMapper answerMapper;

    //메세지 답장 작성
    public void answerInsert(AnswerVO answerVO){;}
    //메세지  답장 한개 가져오기
    public void answerSelectOne(Integer answerNum){;}
    //메세지 답장 수정
    public void answerUpdate(AnswerVO answerVO){;}
    //메세지 답장 삭제
    public void answerDelete(AnswerVO answerVO){;}
    //메세지 답장 보낸 시간 가져오기
    public void answerGetSendDate(){;}
    //메세지 답장 제목 가져오기
    public void answerSelectTitle(AnswerVO answerVO){;}
    //메세지 답장 내용 가져오기
    public void answerSelectContent(AnswerVO answerVO){;}
}
