package com.namanx.customer_ms.controller;

import com.namanx.customer_ms.model.dto.request.CustomerRegistrationRequest;
import com.namanx.customer_ms.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/v1/customer")
public record CustomerController(CustomerService customerService) {

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRequest) {

        log.info("New customer registration {}", customerRequest);
        customerService.registerCustomer(customerRequest);

    }
}
