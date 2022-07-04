package com.example.kovengerss.domain.service;

import com.example.kovengerss.domain.dao.LikeDAO;
import com.example.kovengerss.domain.dao.WarringDAO;
import com.example.kovengerss.domain.vo.LikeVO;
import com.example.kovengerss.domain.vo.WarringVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("warring") @Primary
public class WarringServicelmpl implements WarringService {
    private final WarringDAO warringDAO;

    @Override
    public Integer warringCount(Integer boardNum) {
        return warringDAO.warringCount(boardNum);
    }

    @Override
    public void warringInsert(WarringVO warringVO) {
        warringDAO.warringInsert(warringVO);
    }

    @Override
    public void warringDown(WarringVO warringVO) {
        warringDAO.warringDown(warringVO);
    }

    @Override
    public boolean CountUp(Integer boardNum){
        return warringDAO.CountUp(boardNum);
    }
}
