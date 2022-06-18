package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.AdminDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("admin") @Primary
public class AdminServiceImpl {
    private final AdminDAO adminDAO;
}
