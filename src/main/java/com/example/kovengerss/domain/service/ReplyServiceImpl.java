package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.ReplyDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("reply") @Primary
public class ReplyServiceImpl {
    private final ReplyDAO replyDAO;
}
