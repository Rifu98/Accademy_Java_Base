package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import items.*;

public class FileHandler {
    private static final String USERS_FILE = "users.txt";
    private static final String PRODUCTS_FILE = "products.txt";
    private static final String ORDERS_FILE = "orders.txt";

    public static void writeUserToFile(User user) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(USERS_FILE, true))) {
            writer.println(user.getId() + "," + user.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeProductToFile(Product product) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(PRODUCTS_FILE, true))) {
            writer.println(product.getId() + "," + product.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeOrderToFile(Order order) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ORDERS_FILE, true))) {
            StringBuilder productsString = new StringBuilder();
            for (Product product : order.getProducts()) {
                productsString.append(product.getId()).append(",");
            }
            // Remove the last comma
            if (productsString.length() > 0) {
                productsString.setLength(productsString.length() - 1);
            }
            writer.println(order.getId() + "," + order.getUser().getId() + "," + productsString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
