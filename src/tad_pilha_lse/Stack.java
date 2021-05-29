package tad_pilha_lse;

public interface Stack<E> {

	// Retorna o numero de elementos na pilha.
	public int size();

	// @return True se a pilha e vazia, False em caso contrario.
	public boolean isEmpty();

	// @return o elemento que esta no topo da pilha.
	// @exception EmptyStackException se a pilha estiver vazia.
	public E top() throws EmptyStackException;

	// @param elemento a ser inserido.
	public void push(E element);

	// @return elemento removido.
	// @exception EmptyStackException se a pilha estiver vazia.
	public E pop() throws EmptyStackException;
}
