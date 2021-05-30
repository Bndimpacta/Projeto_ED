package tad_arvore_binaria;

public class Node<E> implements Position<E> {

	private Node<E> prev, next; // Referencia para os nodos anterior e posterior

	private E element; // Elemento armazenado nesta posicao

	// Construtor

	public Node(Node<E> newPrev, Node<E> newNext, E elem) {

		prev = newPrev;

		next = newNext;

		element = elem;

	}

	// Metodo da interface Position

	public E element() throws InvalidPositionException {

		if ((prev == null) && (next == null))

			throw new InvalidPositionException("Position is not in a list!");

		return element;

	}

	// Metodos de acesso

	public Node<E> getNext() {
		return next;
	}

	public Node<E> getPrev() {
		return prev;
	}

	// Metodos de atualizacao

	public void setNext(Node<E> newNext) {
		next = newNext;
	}

	public void setPrev(Node<E> newPrev) {
		prev = newPrev;
	}

	public void setElement(E newElement) {
		element = newElement;
	}

}
