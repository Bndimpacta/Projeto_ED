package tad_lista_de_nodos;

@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException{

	public InvalidPositionException(String mensagemErro) {
		
		super(mensagemErro);
	}
}
