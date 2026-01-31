package com.tothenew.junit.service;

import com.tothenew.junit.domain.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderServiceTest {

    private OrderService orderService;
    private EmailService emailServiceMock;

    @BeforeEach
    void setUp() throws Exception {
        orderService = new OrderService();

        // Create mock
        emailServiceMock = mock(EmailService.class);

        // Inject mock into private field using reflection
        Field field = OrderService.class.getDeclaredField("emailService");
        field.setAccessible(true);
        field.set(orderService, emailServiceMock);
    }

    @Test
    void testPlaceOrderWithoutCC_ShouldThrowException() {
        Order order = new Order(2, "Laptop", 1000);

        // Simulate email throwing exception
        doThrow(new RuntimeException("Email failed"))
                .when(emailServiceMock).sendEmail(order);

        assertThrows(RuntimeException.class, () -> orderService.placeOrder(order));

        // priceWithTax logic check
        assertEquals(1200, order.getPriceWithTax());
    }

    @Test
    void testPlaceOrderWithCC_EmailSuccess() {
        Order order = new Order(1, "Phone", 500);

        when(emailServiceMock.sendEmail(order, "cc@test.com"))
                .thenReturn(true);

        boolean result = orderService.placeOrder(order, "cc@test.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
        assertEquals(600, order.getPriceWithTax());
    }

    @Test
    void testPlaceOrderWithCC_EmailFails() {
        Order order = new Order(1, "Tablet", 500);

        when(emailServiceMock.sendEmail(order, "cc@test.com"))
                .thenReturn(false);

        boolean result = orderService.placeOrder(order, "cc@test.com");

        assertFalse(result);
        assertFalse(order.isCustomerNotified());
        assertEquals(600, order.getPriceWithTax());
    }
}
