package data;

import java.util.Date;

public class Animal extends Enregistrement {

	private String typePermis;
	private String nom;
	private boolean sexe;
	private String couleur;
	private String dateNaissance;
	private boolean vaccination;
	private boolean sterelisation;
	private int poidsKg;
	private boolean micropuce;
	private boolean dangereux;

	public Animal(String typePermis, String nom, boolean sexe, String couleur, String dateNaissance,
			boolean vaccination, boolean sterelisation, int poidsKg, boolean micropuce, boolean dangereux) {
		this.typePermis = typePermis;
		this.nom = nom;
		this.sexe = sexe;
		this.couleur = couleur;
		this.dateNaissance = dateNaissance;
		this.vaccination = vaccination;
		this.sterelisation = sterelisation;
		this.poidsKg = poidsKg;
		this.micropuce = micropuce;
		this.dangereux = dangereux;
	}
}
