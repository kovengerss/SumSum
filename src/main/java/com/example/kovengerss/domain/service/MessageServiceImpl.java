package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.MessageDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("message") @Primary
public class MessageServiceImpl {
    private final MessageDAO messageDAO;
}
