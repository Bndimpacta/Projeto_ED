package tad_lista_de_nodos;


@SuppressWarnings("serial")
public class EmptyListException extends RuntimeException{

	public EmptyListException(String mensagemErro) {
		
		super(mensagemErro);
	}
}
