package memory;

import items.Order;
import services.*;
import exceptions.OrderNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Archivio extends Memory implements IOrderService {
    private List<Order> orders;

    public Archivio(UserService userService, ProductService productService) {
        orders = new ArrayList<>();
        // Aggiungi ordini di esempio
        orders.add(new Order(1, userService.getUserById(1), List.of(productService.getProductById(1), productService.getProductById(2))));
        orders.add(new Order(2, userService.getUserById(2), List.of(productService.getProductById(1), productService.getProductById(2))));
    }

    @Override
    public Order getOrderById(int id) {
        return orders.stream()
                .filter(order -> order.getId() == id)
                .findFirst()
                .orElseThrow(() -> new OrderNotFoundException(id));
    }

    @Override
    public List<Order> getAllOrders() {
        return orders;
    }

	@Override
	public void addOrder(Order order) {
        orders.add(order);
        
	}
}
