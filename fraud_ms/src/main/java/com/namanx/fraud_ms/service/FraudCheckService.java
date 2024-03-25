package com.namanx.fraud_ms.service;

import com.namanx.fraud_ms.entity.FraudCheckHistory;
import com.namanx.fraud_ms.repository.FraudCheckHistoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepo repository;


    public boolean isFraudulentCustomer(Long customerId) {

        repository.save(FraudCheckHistory.builder()
                .customerId(customerId)
                .isFraudster(false)
                .createdAt(LocalDateTime.now())
                .build());
        return false;
    }
}
