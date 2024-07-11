package main;

import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import product.Product;

public class Main {
    private static final Path INVENTORY_FILE = Paths.get("files/inventory.txt");
    private static final Path UPDATED_INVENTORY_FILE = Paths.get("files/inventory_updated.txt");
    private static Map<String, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Aggiungi prodotto");
            System.out.println("2. Aggiorna quantità");
            System.out.println("3. Rimuovi prodotto");
            System.out.println("4. Salva ed esci");
            System.out.println("Scegli un'opzione: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    updateProduct(scanner);
                    break;
                case 3:
                    removeProduct(scanner);
                    break;
                case 4:
                    saveInventory();
                    System.out.println("Inventario salvato.");
                    return;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }

    private static void loadInventory() {
        try {
            List<String> lines = Files.readAllLines(INVENTORY_FILE, StandardCharsets.UTF_8);
            for (String line : lines) {
                String[] parts = line.split(",");
                String name = parts[0];
                int quantity = Integer.parseInt(parts[1]);
                double price = Double.parseDouble(parts[2]);
                inventory.put(name, new Product(name, quantity, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addProduct(Scanner scanner) {
        System.out.println("Nome prodotto: ");
        String name = scanner.nextLine();
        System.out.println("Quantità: ");
        int quantity = scanner.nextInt();
        System.out.println("Prezzo: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        inventory.put(name, new Product(name, quantity, price));
        System.out.println("Prodotto aggiunto.");
    }

    private static void updateProduct(Scanner scanner) {
        System.out.println("Nome prodotto: ");
        String name = scanner.nextLine();
        if (inventory.containsKey(name)) {
            System.out.println("Nuova quantità: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // consume newline
            inventory.get(name).setQuantity(quantity);
            System.out.println("Quantità aggiornata.");
        } else {
            System.out.println("Prodotto non trovato.");
        }
    }

    private static void removeProduct(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        if (inventory.remove(name) != null) {
            System.out.println("Prodotto rimosso.");
        } else {
            System.out.println("Prodotto non trovato.");
        }
    }

    private static void saveInventory() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(UPDATED_INVENTORY_FILE.toFile()))) {
            oos.writeObject(inventory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
