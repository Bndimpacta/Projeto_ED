package tad_arvore_binaria;

import java.util.Iterator;

public class ElementIterator<E> implements Iterator<E> {

	protected PositionList<E> list;

	protected Position<E> cursor;

	// Cria um elemento iterator

	public ElementIterator(PositionList<E> L) {

		list = L;

		cursor = (list.isEmpty()) ? null : list.first();

	}

	// Retorna se o iterator tem ou não um proximo objeto.

	public boolean hasNext() {
		return (cursor != null);
	}

	// Retorna o proximo objeto do iterator.
	public E next() throws NoSuchElementException {

		if (cursor == null)
			throw new NoSuchElementException("No next element");

		E toReturn = cursor.element();

		cursor = (cursor == list.last()) ? null : list.next(cursor);

		return toReturn;

	}

	// Dispara um {@link UnsupportedOperationException} para todos os casos, porque

	// a remocao nao e uma operacao suportada por este iterator.

	public void remove() throws UnsupportedOperationException {

		throw new UnsupportedOperationException("remove");

	}

}
