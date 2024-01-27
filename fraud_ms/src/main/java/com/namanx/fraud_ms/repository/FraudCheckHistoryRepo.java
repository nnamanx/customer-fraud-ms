package com.namanx.fraud_ms.repository;

import com.namanx.fraud_ms.entity.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudCheckHistoryRepo extends JpaRepository<FraudCheckHistory, Long> {
}
