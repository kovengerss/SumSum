package com.example.kovengerss.domain.dao;

import com.example.kovengerss.domain.vo.MessageVO;
import com.example.kovengerss.mapper.MessageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MessageDAO {
    private final MessageMapper messageMapper;

    //메세지(쪽지) 목록
    public List<MessageVO> msgGetList(){ return messageMapper.getList();}
    //메세지(쪽지) 입력
    public  void msgInsert(MessageVO messageVO){messageMapper.insert(messageVO);}
    //메세지(쪽지) 수정
    public  boolean msgUpdate(MessageVO messageVO){ return messageMapper.update(messageVO) ==1;}
    //메세지(쪽지) 삭제
    public  boolean msgDelete(MessageVO messageVO){ return messageMapper.delete(messageVO) ==1;}
    //메세지(쪽지) 전체수
    public int msgGetTotal(){ return messageMapper.getTotal();}
    //메세지(쪽지) 보낸 시간 가져오기
    public String msgGetSendDate(int messageNum){ return messageMapper.getSendDate(messageNum);}
    //메세지(쪽지) 한개 가져오기
    public MessageVO msgSelectOne(int messageNum){return messageMapper.select(messageNum);}
    //메세지(쪽지) 제목 가져오기
    public String msgSelectTitle(int messageNum){return messageMapper.selectTitle(messageNum);}
    //메세지(쪽지) 내용 가져오기
    public String msgSelectContent(int messageNum){return messageMapper.selectContent(messageNum);}
}