package tad_lista_arranjo;

public interface IndexList<E> {
	
	// Retorna o numero de elementos na lista
	public int size();

	// Retorna se a lista estiver vazia
	public boolean isEmpty();

	// Insere um elemento, e, no indice, i, deslocando todos os elmentos depois dele
	public void add(int i, E e) throws IndexOutOfBoundsException;

	// Retorna um elemento no indice i, sem remove-lo
	public E get(int i) throws IndexOutOfBoundsException;

	// Remove e retorna o elemento do indice i, deslocando os elementos depois dele
	public E remove(int i) throws IndexOutOfBoundsException;

	// Troca o elemento de i com e, retornando o elemento que estava em i
	public E set(int i, E e) throws IndexOutOfBoundsException;
}
