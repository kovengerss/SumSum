package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.AnswerVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnswerMapper {

    //메세지 답장 총 목록
    public List<AnswerVO> getList();
    //메세지 답장 작성
    public void insert(AnswerVO answerVO);
    //메세지  답장 한개 가져오기
    public AnswerVO select(Integer answerNum);
    //메세지 답장 수정
    public int update(AnswerVO answerVO);
    //메세지 답장 삭제
    public int delete(int answerNum);
    //메세지 답장 보낸 시간 가져오기
    public String getSendDate(int answerNum);
    //메세지 답장 제목 가져오기
    public String selectTitle(int answerNum);
    //메세지 답장 내용 가져오기
    public String selectContent(int answerNum);

}