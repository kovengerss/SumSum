package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.AnswerVO;
import com.example.kovengerss.mapper.AnswerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AnswerDAO {
    private final AnswerMapper answerMapper;

    //메세지 답장 총 목록
    public List<AnswerVO> getList(){
        return answerMapper.getList();
    }
    //메세지 답장 작성
    public void answerInsert(AnswerVO answerVO){
        answerMapper.insert(answerVO);
    }
    //메세지  답장 한개 가져오기
    public AnswerVO answerSelectOne(int answerNum){
        return answerMapper.select(answerNum);}
    //메세지 답장 수정
    public boolean answerUpdate(AnswerVO answerVO){
        return answerMapper.update(answerVO)==1;}
    //메세지 답장 삭제
    public boolean answerDelete(int answerNum){
        return answerMapper.delete(answerNum)==1;
    }
    //메세지 답장 보낸 시간 가져오기
    public String answerGetSendDate(int answerNum){
        return answerMapper.getSendDate(answerNum); }
    //메세지 답장 제목 가져오기
    public String answerSelectTitle(int answerNum){
        return answerMapper.selectTitle(answerNum);}
    //메세지 답장 내용 가져오기
    public String answerSelectContent(int answerNum){
        return answerMapper.selectContent(answerNum);}
}