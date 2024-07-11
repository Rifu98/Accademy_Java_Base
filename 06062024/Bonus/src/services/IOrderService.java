package services;

import java.util.List;

import items.Order;
import items.User;

public interface IOrderService {
    Order getOrderById(int id);
    List<Order> getAllOrders();
    void addOrder(Order order);
}