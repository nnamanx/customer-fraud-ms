package com.namanx.fraud_ms.controller;

import com.namanx.fraud_ms.dto.response.FraudCheckResponse;
import com.namanx.fraud_ms.service.FraudCheckService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("api/v1/fraud-check")
public class FraudCheckController {

    private final FraudCheckService service;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") Long customerId) {

        boolean isFraudulentCustomer = service.isFraudulentCustomer(customerId);

        // for not checking db frequently
        log.info("fraud check request for customer {}", customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
