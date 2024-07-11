package main;

import controller.Controller;
import exceptions.UserNotFoundException;
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

        // Test error handling
        System.out.println("\nProva a ottenere utente con ID 3 (non esistente):");
        try {
        	System.out.println(controller.getUserById(3));
        } catch (UserNotFoundException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\nProva a ottenere prodotto con ID 3 (non esistente):");
        System.out.println(controller.getProductById(3));

        System.out.println("\nProva a ottenere ordine con ID 3 (non esistente):");
        System.out.println(controller.getOrderById(3));
    }
}
