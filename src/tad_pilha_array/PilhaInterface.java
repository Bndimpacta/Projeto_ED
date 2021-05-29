package tad_pilha_array;

public interface PilhaInterface<TIPO> {

	public int size();
	
	public boolean isEmpty();
	
	public TIPO top() throws PilhaExcecao_PilhaVazia;
	
	public TIPO pop() throws PilhaExcecao_PilhaCompleta;
	
	public void push(TIPO elemento) throws PilhaExcecao_PilhaCompleta;
}
