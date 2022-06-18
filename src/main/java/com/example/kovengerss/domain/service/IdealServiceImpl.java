package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.IdealDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("ideal") @Primary
public class IdealServiceImpl {
    private final IdealDAO idealDAO;
}
