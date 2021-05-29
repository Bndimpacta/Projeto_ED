package tad_fila_lse;

@SuppressWarnings("serial")
public class FilaExcecao_FilaVazia extends RuntimeException{
	
	public FilaExcecao_FilaVazia(String mensagemErro) {
		
		super(mensagemErro);
	}
}
