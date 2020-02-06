package genericite.heritageEtGenericite;

// Classe Personne.java

import java.io.Serializable;

/**
 * Classe repr�sentant une personne
 * 
 * @author Doudou Camara
 *
 */

public class Personne implements Serializable {

	private static final long serialVersionUID = -7729571561256028431L;

	private String nom = "Inconnu";
	private String sexe = "Inconnu";
	private double taille = Double.NaN;

	transient private String nomTemporaire = "temp";

	public Personne(String nom, String sexe, double taille) {
		this.nom = nom;
		this.sexe = sexe;
		this.taille = taille;
	}

	@Override
	public String toString() {
		return "Nom : " + this.nom + ", sexe: " + this.sexe + ", taille: " + this.taille + ", nom temporaire: "
				+ this.nomTemporaire;
	}

	public void setNomTemporaire(String nomTemporaire) {
		this.nomTemporaire = nomTemporaire;
	}

	public String getNom() {
		return nom;
	}

}
