package tad_ordenado_avl;

@SuppressWarnings("serial")
public class InvalidEntryException extends RuntimeException {
	public InvalidEntryException(String err) {
		super(err);
	}
}
