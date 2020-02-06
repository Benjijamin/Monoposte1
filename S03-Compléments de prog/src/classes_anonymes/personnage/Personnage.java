package classes_anonymes.personnage;

import classes_anonymes.personnage.comportement.AucunSoin;
import classes_anonymes.personnage.comportement.ISoigneur;

public abstract class Personnage {

	private String nom = null;
	private int age = 0;
	private ISoigneur soinPossible = new AucunSoin();

	public Personnage(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}

	public abstract void manger();

	public void soigner() {
		soinPossible.soigner();
	}

	public void setSoinPossible(ISoigneur soin) {
		this.soinPossible = soin;
	}
}
