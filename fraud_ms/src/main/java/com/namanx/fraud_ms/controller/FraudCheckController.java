package com.namanx.fraud_ms.controller;

import com.namanx.fraud_ms.dto.response.FraudCheckResponse;
import com.namanx.fraud_ms.service.FraudCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/fraud-check")
public class FraudCheckController {

    private final FraudCheckService service;

    @PostMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") Long customerId) {

        boolean isFraudulentCustomer = service.isFraudulentCustomer(customerId);

        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
