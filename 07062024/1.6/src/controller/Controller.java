package controller;

import items.*;
import services.*;
import exceptions.*;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private UserService userService;
    private ProductService productService;
    private OrderService orderService;

    public Controller(UserService userService, ProductService productService, OrderService orderService) {
        this.userService = userService;
        this.productService = productService;
        this.orderService = orderService;
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public User getUserById(int id) {
            return userService.getUserById(id);
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    public Product getProductById(int id) {
        try {
            return productService.getProductById(id);
        } catch (ProductNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    public Order getOrderById(int id) {
        try {
            return orderService.getOrderById(id);
        } catch (OrderNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    public User addUser(String name) {
        int newUserId = userService.getAllUsers().size() + 1; // Genera un nuovo ID
        User newUser = new User(newUserId, name);
        userService.addUser(newUser);
        return newUser;
    }

    public Product addProduct(String name) {
        int newProductId = productService.getAllProducts().size() + 1; // Genera un nuovo ID
        Product newProduct = new Product(newProductId, name);
        productService.addProduct(newProduct);
        return newProduct;
    }

    public Order addOrder(int userId, int productId) {
        User user = userService.getUserById(userId);
        Product product = productService.getProductById(productId);
        List<Product> products = new ArrayList<>();
        products.add(product);
		Order newOrder = new Order(productId, user, products);
        orderService.addOrder(newOrder);
        return newOrder;
    }
}
