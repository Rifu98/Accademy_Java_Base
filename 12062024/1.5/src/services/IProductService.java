package services;

import java.util.List;

import items.Product;
import items.User;

public interface IProductService {
    Product getProductById(int id);
    List<Product> getAllProducts();
    void addProduct(Product product);
}
