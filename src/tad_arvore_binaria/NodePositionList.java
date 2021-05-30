package tad_arvore_binaria;

import java.util.Iterator;

public class NodePositionList<E> implements PositionList<E> {

	protected int numElts; // Numero de elementos na lista

	protected Node<E> header, trailer; // Sentinelas especiais

	// Construtor que cria uma lista vazia

	public NodePositionList() {

		numElts = 0;

		header = new Node<E>(null, null, null); // cria a cabeca

		trailer = new Node<E>(header, null, null); // cria a cauda

		header.setNext(trailer); // faz a cabeca e a cauda apontarem uma para a outra

	}

	// Verifica se a posicao e valida para esta lista e a converte para DNode se for
	// valida

	protected Node<E> checkPosition(Position<E> p) throws InvalidPositionException {

		if (p == null)
			throw new InvalidPositionException("Null position passed to NodeList");

		if (p == header)
			throw new InvalidPositionException("The header node is not a valid position");

		if (p == trailer)
			throw new InvalidPositionException("The trailer node is not a valid position");

		try {

			Node<E> temp = (Node<E>) p;

			if ((temp.getPrev() == null) || (temp.getNext() == null))

				throw new InvalidPositionException("Position does not belong to a valid NodeList");

			return temp;

		} catch (ClassCastException e) {

			throw new InvalidPositionException("Position is of wrong type for this list");

		}

	}

	// Retorna a quantidade de elementos na lista

	public int size() {
		return numElts;
	}

	// Retorna quando a lista esta vazia

	public boolean isEmpty() {
		return (numElts == 0);
	}

	// Retorna a primeira posicao da lista

	public Position<E> first() throws EmptyListException {

		if (isEmpty())
			throw new EmptyListException("List is empty");

		return header.getNext();

	}

	// Retorna a posicao que antecede a fornecida

	public Position<E> prev(Position<E> p) throws InvalidPositionException, BoundaryViolationException {

		Node<E> v = checkPosition(p);

		Node<E> prev = v.getPrev();

		if (prev == header)
			throw new BoundaryViolationException("Cannot advance past the beginning of the list");

		return prev;

	}

	// Insere o elemento antes da posicao fornecida, retornando a nova posicao

	public void addBefore(Position<E> p, E element) throws InvalidPositionException {

		Node<E> v = checkPosition(p);

		numElts++;

		Node<E> newNode = new Node<E>(v.getPrev(), v, element);

		v.getPrev().setNext(newNode);

		v.setPrev(newNode);

	}

	// Insere o elemento dado no inicio da lista, retornando a nova posicao

	public void addFirst(E element) {

		numElts++;

		Node<E> newNode = new Node<E>(header, header.getNext(), element);

		header.getNext().setPrev(newNode);

		header.setNext(newNode);

	}

	// Remove da lista a posicao fornecida

	public E remove(Position<E> p) throws InvalidPositionException {

		Node<E> v = checkPosition(p);

		numElts--;

		Node<E> vPrev = v.getPrev();

		Node<E> vNext = v.getNext();

		vPrev.setNext(vNext);

		vNext.setPrev(vPrev);

		E vElem = v.element();

		// Desconecta a posicao da lista e marca-a como invalida

		v.setNext(null);

		v.setPrev(null);

		return vElem;

	}

	// Substitui o elemento da posicao fornecida por um novo e retorna o elemento
	// velho

	public E set(Position<E> p, E element) throws InvalidPositionException {

		Node<E> v = checkPosition(p);

		E oldElt = v.element();

		v.setElement(element);

		return oldElt;

	}

	// Retorna o ultimo nodo da lista.

	public Position<E> last() {

		if (isEmpty())
			throw new EmptyListException("List is empty");

		return trailer.getPrev();

	}

	// Retorna o nodo que segue um dado nodo da lista.

	public Position<E> next(Position<E> p) throws InvalidPositionException, BoundaryViolationException {

		Node<E> v = checkPosition(p);

		Node<E> next = v.getNext();

		if (next == trailer)
			throw new BoundaryViolationException("Cannot advance past the finaling of the list");

		return next;

	}

	// Insere um elemento na ultima posicao, retornando uma posicao nova.

	public void addLast(E e) {

		numElts++;

		Node<E> newNode = new Node<E>(trailer.getPrev(), trailer, e);

		trailer.getPrev().setNext(newNode);

		trailer.setPrev(newNode);

	}

	// Insere um elemento apos um dado elemento da lista.

	public void addAfter(Position<E> p, E e) throws InvalidPositionException {

		if (checkpositionlist(p) == false) {
			throw new InvalidPositionException("Nodo não pertence a lista");
		}

		Node<E> v = checkPosition(p);

		numElts++;

		Node<E> newNode = new Node<E>(v, v.getNext(), e);

		v.getNext().setPrev(newNode);

		v.setNext(newNode);

	}

	public void MakeFirst(Position<E> mudar) {
		Node p = header.getNext();
		Node temp = this.checkPosition(mudar);

		Node mprev = temp.getPrev();
		Node mnext = temp.getNext();
		mprev.setNext(mnext);
		mnext.setPrev(mprev);

		temp.setNext(header.getNext());
		temp.setPrev(header);
		header.setNext(temp);

	}

	public boolean checkpositionlist(Position<E> p) {
		Node<E> recebido = checkPosition(p);
		Node<E> primeiro = header.getNext();

		for (int i = 0; i < numElts; i++) {

			if (recebido.element() == primeiro.element()) {
				if (recebido.getPrev() == primeiro.getPrev() && recebido.getNext() == recebido.getNext()) {
					return true;
				}
			}
			primeiro = primeiro.getNext();
		}
		return false;
	}

	// Retorna a representacao textual de uma lista de nodos

	public static <E> String toString(PositionList<E> l) {
		String s = "";
		for (E i : l) {
			s += ", " + i;
		}
		s = (s.length() == 0 ? s : s.substring(2));
		return "[" + s + "]";
	}
	
	// Retorna o iterator a partir do ElemenIterator.
	public Iterator<E> iterator() {
		return new ElementIterator<E>(this);
	}

	public String toString() {
		return toString(this);
	}

}
