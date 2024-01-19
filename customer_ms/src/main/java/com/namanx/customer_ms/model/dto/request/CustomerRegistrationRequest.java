package com.namanx.customer_ms.model.dto.request;

import lombok.Builder;
import lombok.Data;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
