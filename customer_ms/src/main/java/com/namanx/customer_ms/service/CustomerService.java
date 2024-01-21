package com.namanx.customer_ms.service;

import com.namanx.customer_ms.model.dto.request.CustomerRegistrationRequest;
import com.namanx.customer_ms.model.entity.Customer;
import com.namanx.customer_ms.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {

    public void registerCustomer(CustomerRegistrationRequest request) {

        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // todo: check if email is valid
        // todo: check if email is not taken
        customerRepository.save(customer);
    }
}
