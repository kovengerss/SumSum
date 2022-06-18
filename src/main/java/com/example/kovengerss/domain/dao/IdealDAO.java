package com.example.kovengerss.domain.dao;

import com.example.kovengerss.mapper.IdealMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class IdealDAO {
    private final IdealMapper idealMapper;
}
