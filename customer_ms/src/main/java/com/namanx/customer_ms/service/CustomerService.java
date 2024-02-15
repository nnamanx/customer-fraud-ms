package com.namanx.customer_ms.service;

import com.namanx.customer_ms.model.dto.request.CustomerRegistrationRequest;
import com.namanx.customer_ms.model.entity.Customer;
import com.namanx.customer_ms.repository.CustomerRepository;
import com.namanx.customer_ms.repository.FraudCheckResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final RestTemplate restTemplate;

    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {

        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // todo: check if email is valid
        // todo: check if email is not taken
        customerRepository.saveAndFlush(customer);
        // todo: check if fraudster
        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                "http://localhost:8082/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId()
        );

        if (fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("FRAUDSTER");
        }
        // todo: send notification
    }
}
