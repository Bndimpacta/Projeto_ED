package tad_pilha_lse;

public class Node<E> {

	// Variaveis de instancia
	private E element;
	private Node<E> next;

	// Cria um nodo com referencias nulas para os seus elementos e o proximo nodo
	public Node() {
		this(null, null);
	}

	// Cria um nodo com um dado elemento e o proximo nodo
	public Node(E e, Node<E> n) {
		element = e;
		next = n;
	}

	// Metodos de acesso:
	public E getElement() {
		return element;
	}

	public Node<E> getNext() {
		return next;
	}

	// Metodos modificadores:
	public void setElement(E newElem) {
		element = newElem;
	}

	public void setNext(Node<E> newNext) {
		next = newNext;
	}
}
