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
    public  void update(MessageVO messageVO);
    //메세지(쪽지) 삭제
    public  void delete(MessageVO messageVO);
    //메세지(쪽지) 전체수
    public Integer getTotal();
    //메세지(쪽지) 보낸 시간 가져오기
    public String getSendDate();
    //메세지(쪽지) 한개 가져오기
    public MessageVO select(Integer messageNum);
    //메세지(쪽지) 제목 가져오기
    public String selectTitle(MessageVO messageVO);
    //메세지(쪽지) 내용 가져오기
    public String selectContent(MessageVO messageVO);
}
