package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.PointDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("point") @Primary
public class PointServiceImpl {
    private final PointDAO pointDAO;
}
