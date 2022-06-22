package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.vo.MessageVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {

    //메세지(쪽지) 목록
    public List<MessageVO> getList();
    //메세지(쪽지) 입력
    public  void msgInsert(MessageVO messageVO);
    //메세지(쪽지) 수정
    public   boolean msgUpdate(MessageVO messageVO);
    //메세지(쪽지) 삭제
    public   boolean msgDelete(Integer messageNum);
    //메세지(쪽지) 전체수
    public int msgGetTotal();
    //메세지(쪽지) 보낸 시간 가져오기
    public String msgGetSendDate(int messageNum);
    //메세지(쪽지) 한개 가져오기
    public MessageVO msgSelectOne(int messageNum);
    //메세지(쪽지) 제목 가져오기
    public String msgSelectTitle(int messageNum);
    //메세지(쪽지) 내용 가져오기
    public String msgSelectContent(int messageNum);
}
