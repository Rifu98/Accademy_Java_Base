package memory;

import items.Product;
import services.IProductService;
import exceptions.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Locale extends Memory implements IProductService {
    private List<Product> products;

    public Locale() {
        products = new ArrayList<>();
        products.add(new Product(1, "Laptop"));
        products.add(new Product(2, "Smartphone"));
    }

    @Override
    public Product getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

	@Override
	public void addProduct(Product product) {
        products.add(product);
	}
}
