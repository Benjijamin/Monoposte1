package chainage;

import chainage.exception.PileVideException;

/**
 * Implementation d'une pile dynamique par chaînage de noeuds auto-référentiels
 * 
 * @author Jocelyn
 */
public class Pile {

	private NoeudPile sommet = null;

	public Pile() {
		this.sommet = null;
	}

	public boolean isEmpty() {
		return (this.sommet == null);
	}

	public void clear() {
		this.sommet = null;

		System.gc();
	}

	public void push(Object pElement) {
		this.sommet = new NoeudPile(pElement, this.sommet);
	}

	public Object pop() throws PileVideException {
		Object retour = null;

		if (!this.isEmpty()) {
			retour = this.sommet.getElement();
			this.sommet = this.sommet.getPrecedent();
		} else {
			throw new PileVideException("Pile vide");
		}

		return retour;
	}

	public Object getPremier() throws PileVideException {
		Object element = null;

		if (!this.isEmpty()) {
			element = this.sommet.getElement();
		} else {
			throw new PileVideException("Pile vide");
		}

		return element;
	}

	@Override
	public String toString() {
		String s = "";
		NoeudPile courant = this.sommet; // Pointeur de parcourt

		while (courant != null) {
			s = s + courant.getElement() + "\n";
			courant = courant.getPrecedent();
		}

		return s;
	}

	/**
	 * calsse interne pour la définition d'un noeud dynamique pour une pile
	 * 
	 * @author Jocelyn
	 */
	private class NoeudPile {

		private Object element = null;
		private NoeudPile precedent = null;

		public NoeudPile(Object pElement) {
			this(pElement, null);
		}

		public NoeudPile(Object pElement, NoeudPile pPrecedent) {
			this.setElement(pElement);
			this.setPrecedent(pPrecedent);
		}

		public Object getElement() {
			return element;
		}

		public void setElement(Object pElement) {
			this.element = pElement;
		}

		public NoeudPile getPrecedent() {
			return precedent;
		}

		public void setPrecedent(NoeudPile pPrecedent) {
			this.precedent = pPrecedent;
		}
	}
}
