package services;

import java.util.List;

import items.Order;
import memory.Archivio;

public class OrderService implements IOrderService{
	
	Archivio archivio;
	
	public OrderService (UserService userService, ProductService productService) {
		this.archivio = new Archivio(userService, productService);
	}

	@Override
	public Order getOrderById(int id) {
		return archivio.getOrderById(id);
	}
	@Override
	public List<Order> getAllOrders() {
		return archivio.getAllOrders();
	}

	@Override
	public void addOrder(Order order) {
		archivio.addOrder(order);
	}
}
