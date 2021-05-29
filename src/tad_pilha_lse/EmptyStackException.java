package tad_pilha_lse;

@SuppressWarnings("serial")
public class EmptyStackException extends RuntimeException{
	public EmptyStackException(String err) {
		super(err);
	}
}