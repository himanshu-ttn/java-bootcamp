package com.tothenew.junit.service;

import com.tothenew.junit.domain.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    @Test
    void sendEmail_shouldThrowException() {
        EmailService emailService = new EmailService();
        Order order = new Order(1, "Book", 100);

        RuntimeException exception =
                assertThrows(RuntimeException.class,
                        () -> emailService.sendEmail(order));

        assertEquals("An Exception Occurred", exception.getMessage());
        assertFalse(order.isCustomerNotified());
    }

    @Test
    void sendEmailWithCC_shouldReturnTrue() {
        EmailService emailService = new EmailService();
        Order order = new Order(1, "Book", 100);

        boolean result = emailService.sendEmail(order, "test@gmail.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
    }
}
