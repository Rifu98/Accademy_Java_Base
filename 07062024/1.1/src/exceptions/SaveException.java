package exceptions;

public class SaveException extends DocumentException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaveException(String message) {
        super(message);
    }
}