package com.tothenew.junit.service;

import com.tothenew.junit.domain.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    void testPlaceOrderWithoutCC_ShouldThrowException() {
        OrderService orderService = new OrderService();
        Order order = new Order(2, "Laptop", 1000);

        RuntimeException exception =
                assertThrows(RuntimeException.class,
                        () -> orderService.placeOrder(order));

        // Exception propagated from EmailService
        assertEquals("An Exception Occurred", exception.getMessage());

        // priceWithTax logic check
        assertEquals(1200, order.getPriceWithTax());

        // customer not notified due to exception
        assertFalse(order.isCustomerNotified());
    }

    @Test
    void testPlaceOrderWithCC_EmailSuccess() {
        OrderService orderService = new OrderService();
        Order order = new Order(1, "Phone", 500);

        boolean result = orderService.placeOrder(order, "cc@test.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
        assertEquals(600, order.getPriceWithTax());
    }
}
