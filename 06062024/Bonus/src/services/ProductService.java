package services;

import java.util.List;

import memory.Locale;

import items.Product;

public class ProductService implements IProductService {
	
	Locale locale;
	
	public ProductService () {
		this.locale = new Locale();
	}

	@Override
	public Product getProductById(int id) {
		return locale.getProductById(id);
	}

	@Override
	public List<Product> getAllProducts() {
		return locale.getAllProducts();
	}

	@Override
	public void addProduct(Product product) {
		locale.addProduct(product);
		
	}
}
