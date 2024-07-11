package exceptions;

public class SaldoInsufficienteException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsufficienteException(String message) {
        super(message);
    }
}
