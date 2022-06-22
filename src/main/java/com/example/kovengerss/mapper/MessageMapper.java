package com.example.kovengerss.mapper;

import com.example.kovengerss.domain.vo.MessageVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {
    //메세지(쪽지) 목록
    public List<MessageVO> getList();
    //메세지(쪽지) 입력
    public  void insert(MessageVO messageVO);
    //메세지(쪽지) 수정
    public  int update(MessageVO messageVO);
    //메세지(쪽지) 삭제
    public  int delete(Integer messageNum);
    //메세지(쪽지) 전체수
    public int getTotal();
    //메세지(쪽지) 보낸 시간 가져오기
    public String getSendDate(int messageNum);
    //메세지(쪽지) 한개 가져오기
    public MessageVO select(int messageNum);
    //메세지(쪽지) 제목 가져오기
    public String selectTitle(int messageNum);
    //메세지(쪽지) 내용 가져오기
    public String selectContent(int messageNum);
}
