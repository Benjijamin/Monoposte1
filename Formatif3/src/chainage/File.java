package chainage;

import chainage.exception.FileVideException;

/**
 * Implementation d'une file dynamique par chaînage de noeuds auto-référentiels
 * 
 * @author Jocelyn
 */
public class File {

	private NoeudFile debut = null;
	private NoeudFile fin = null;

	public File() {
		this.debut = null;
		this.fin = null;
	}

	public boolean isEmpty() {
		return (this.debut == null);
	}

	public void clear() {
		this.debut = this.fin = null;
	}

	public void add(Object pElement) {
		NoeudFile temp = new NoeudFile(pElement, null);

		// Si ce n'est pas le premier noeud
		if (!this.isEmpty()) {
			this.fin.setSuivant(temp);
		} else
		// Sinon c'est le premier noeud
		{
			this.debut = temp;
		}

		this.fin = temp;
	}

	public Object remove() {
		Object retour = null;

		if (!this.isEmpty()) {
			retour = this.debut.getElement();
			this.debut = this.debut.getSuivant();

			if (this.isEmpty()) {
				this.fin = null;
			}
		} else {
			throw new FileVideException("La file est vide...");
		}

		return retour;
	}

	public Object element() {
		Object retour = null;

		if (!this.isEmpty()) {
			retour = this.debut.getElement();
		} else {
			throw new FileVideException("La file est vide...");
		}

		return retour;
	}

	@Override
	public String toString() {
		String chaine = "";
		NoeudFile courant = this.debut;

		while (courant != null) {
			chaine += "[" + courant.getElement() + "], ";
			courant = courant.getSuivant();
		}

		return chaine;
	}

	/**
	 * calsse interne pour la définition d'un noeud dynamique pour une file
	 * 
	 * @author Jocelyn
	 */
	private class NoeudFile {

		private Object element = null;
		private NoeudFile suivant = null;

		public NoeudFile(Object pElement) {
			this(pElement, null);
		}

		public NoeudFile(Object pElement, NoeudFile pNoeud) {
			this.setElement(pElement);
			this.setSuivant(pNoeud);
		}

		public Object getElement() {
			return this.element;
		}

		public void setElement(Object pElement) {
			this.element = pElement;
		}

		public NoeudFile getSuivant() {
			return this.suivant;
		}

		public void setSuivant(NoeudFile pNoeud) {
			this.suivant = pNoeud;
		}
	}
}