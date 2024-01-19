package com.namanx.customer_ms.model.dto.request;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CustomerRegistrationRequestDiffblueTest {
    /**
     * Method under test: {@link CustomerRegistrationRequest#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new CustomerRegistrationRequest()).canEqual("Other"));
    }

    /**
     * Method under test: {@link CustomerRegistrationRequest#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        CustomerRegistrationRequest buildResult = CustomerRegistrationRequest.builder().build();
        assertTrue(buildResult.canEqual(CustomerRegistrationRequest.builder().build()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link CustomerRegistrationRequest}
     *   <li>{@link CustomerRegistrationRequest#toString()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertEquals("CustomerRegistrationRequest()", (new CustomerRegistrationRequest()).toString());
    }

    /**
     * Method under test: {@link CustomerRegistrationRequest#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(CustomerRegistrationRequest.builder().build(), null);
        assertNotEquals(CustomerRegistrationRequest.builder().build(), "Different type to CustomerRegistrationRequest");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CustomerRegistrationRequest#equals(Object)}
     *   <li>{@link CustomerRegistrationRequest#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        CustomerRegistrationRequest buildResult = CustomerRegistrationRequest.builder().build();
        assertEquals(buildResult, buildResult);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CustomerRegistrationRequest#equals(Object)}
     *   <li>{@link CustomerRegistrationRequest#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        CustomerRegistrationRequest buildResult = CustomerRegistrationRequest.builder().build();
        CustomerRegistrationRequest buildResult2 = CustomerRegistrationRequest.builder().build();
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }
}

