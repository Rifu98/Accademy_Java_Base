package it.federico.rifugiato.Esercizi_test.Esercizio_5;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OrderServiceTest {

    private OrderRepository orderRepository;
    private PaymentService paymentService;
    private OrderService orderService;
    private Order orderMock;

    @BeforeEach
    public void setUp() {
        orderRepository = Mockito.mock(OrderRepository.class);
        paymentService = Mockito.mock(PaymentService.class);
        orderMock = Mockito.mock(Order.class);
        orderService = new OrderService(orderRepository, paymentService);
    }

    @Test
    public void testPlaceOrderPaymentSuccess() {
    	Order order = new Order(100);
        Mockito.when(paymentService.processPayment(order.getAmount())).thenReturn(true);

        assertTrue(orderService.placeOrder(order));
        Mockito.verify(orderRepository).save(order);
    }

    @Test
    public void testPlaceOrderPaymentFailure() {
        Mockito.when(paymentService.processPayment(orderMock.getAmount())).thenReturn(false);

        assertFalse(orderService.placeOrder(orderMock));
        Mockito.verify(orderRepository, times(0)).save(orderMock);
    }
}

