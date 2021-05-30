package tad_lista_de_nodos;

@SuppressWarnings("serial")
public class BoundaryViolationException extends RuntimeException{
	
	public BoundaryViolationException(String mensagemErro) {
		
		super(mensagemErro);
	}
}
