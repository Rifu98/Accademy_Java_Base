package main;

import controller.Controller;
import services.*;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        ProductService productService = new ProductService();
        OrderService orderService = new OrderService(userService, productService);

        Controller controller = new Controller(userService, productService, orderService);

        stampa(controller);
        controller.addUser("gigio");
        controller.addProduct("bagigio");
        stampa(controller);
        controller.addOrder(1,1);
    }
    
    public static void stampa(Controller controller) {

        System.out.println("Tutti gli utenti:");
        controller.getAllUsers().forEach(System.out::println);

        System.out.println("\nTutti i prodotti:");
        controller.getAllProducts().forEach(System.out::println);

        System.out.println("\nTutti gli ordini:");
        controller.getAllOrders().forEach(System.out::println);

        System.out.println("\nDettagli utente con ID 1:");
        System.out.println(controller.getUserById(1));

        System.out.println("\nDettagli prodotto con ID 1:");
        System.out.println(controller.getProductById(1));

        System.out.println("\nDettagli ordine con ID 1:");
        System.out.println(controller.getOrderById(1));
    }
}
