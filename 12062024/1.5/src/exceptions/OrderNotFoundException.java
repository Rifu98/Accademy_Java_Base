package exceptions;

public class OrderNotFoundException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderNotFoundException(int id) {
        super("Ordine con ID " + id + " non trovato.");
    }
}

