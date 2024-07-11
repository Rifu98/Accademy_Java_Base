package exceptions;

public class ProductNotFoundException extends RuntimeException {
    /**
	 * ma che è sta roba?
	 */
	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(int id) {
        super("Prodotto con ID " + id + " non trovato.");
    }
}
