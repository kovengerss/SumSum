package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.MessageDAO;
import com.example.kovengerss.domain.vo.MessageVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("message") @Primary
public class MessageServiceImpl implements MessageService{
    private final MessageDAO messageDAO;

    @Override
    public List<MessageVO> getList() {
        return null;
    }

    @Override
    public void msgInsert(MessageVO messageVO) {

    }

    @Override
    public void msgUpdate(MessageVO messageVO) {

    }

    @Override
    public void msgDelete(MessageVO messageVO) {

    }

    @Override
    public Integer msgGetTotal() {
        return null;
    }

    @Override
    public String msgGetSendDate() {
        return null;
    }

    @Override
    public MessageVO msgSelectOne(Integer messageNum) {
        return null;
    }

    @Override
    public String msgSelectTitle(MessageVO messageVO) {
        return null;
    }

    @Override
    public String msgSelectContent(MessageVO messageVO) {
        return null;
    }
}
