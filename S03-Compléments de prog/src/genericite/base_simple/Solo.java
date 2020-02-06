package genericite.base_simple;

public class Solo<T> {

	// Variable d'instance, T va être défini à l'instanciation de la classe
	private T valeur;

	// Constructeur par défaut
	public Solo() {
		this.valeur = null;
	}

	// Constructeur avec paramètre inconnu pour l'instant
	public Solo(T val) {
		this.valeur = val;
	}

	// Définit la valeur avec le paramètre
	public void setValeur(T val) {
		this.valeur = val;
	}

	// Retourne la valeur déjà « castée » par la signature de la méthode !
	public T getValeur() {
		return this.valeur;
	}
}
