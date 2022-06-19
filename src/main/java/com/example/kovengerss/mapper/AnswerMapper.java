package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.AnswerVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AnswerMapper {

    //메세지 답장 작성
    public void insert(AnswerVO answerVO);
    //메세지  답장 한개 가져오기
    public AnswerVO select(Integer answerNum);
    //메세지 답장 수정
    public void update(AnswerVO answerVO);
    //메세지 답장 삭제
    public void delete(AnswerVO answerVO);
    //메세지 답장 보낸 시간 가져오기
    public String getSendDate();
    //메세지 답장 제목 가져오기
    public String selectTitle(AnswerVO answerVO);
    //메세지 답장 내용 가져오기
    public String selectContent(AnswerVO answerVO);

}
