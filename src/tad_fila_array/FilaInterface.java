package tad_fila_array;

public interface FilaInterface<TIPO> {

	public int size();
	
	public boolean isEmpty();
	
	public TIPO front() throws FilaExcecao_FilaVazia;
	
	public void enqueue(TIPO elemento) throws FilaExcecao_FilaCompleta;
	
	public TIPO denqueue() throws FilaExcecao_FilaVazia;
}
