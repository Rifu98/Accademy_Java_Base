package exceptions;

public class UserNotFoundException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(int id) {
        super("Utente con ID " + id + " non trovato.");
    }
}
