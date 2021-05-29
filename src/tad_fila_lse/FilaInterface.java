package tad_fila_lse;

public interface FilaInterface<TIPO> {

	public int size();
	
	public boolean isEmpty();
	
	public TIPO front() throws FilaExcecao_FilaVazia;
	
	public void enqueue(TIPO elemento);
	
	public TIPO denqueue() throws FilaExcecao_FilaVazia;
}
