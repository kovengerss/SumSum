package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.LikeDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("like") @Primary
public class LikeServiceImpl {
    private final LikeDAO likeDAO;
}
