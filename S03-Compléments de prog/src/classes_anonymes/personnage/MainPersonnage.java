package classes_anonymes.personnage;

import classes_anonymes.personnage.comportement.ISoigneur;
import classes_anonymes.personnage.comportement.Operation;
import classes_anonymes.personnage.comportement.SoinsInfermier;

public class MainPersonnage {

	public static void main(String[] args) {
		Personnage p = new Guerrier("Jupiter", 675);

		p.manger();
		p.soigner();

		// On change de type de soins
		p.setSoinPossible(new Operation());
		p.soigner();

		// On change de type de soins
		p.setSoinPossible(new SoinsInfermier());
		p.soigner();

		// Selon l'évolution de l'application le "Personnage" peut changer son type de
		// soins

		// Utilisation d'une classe anonyme pour personnaliser le type de soins
		p.setSoinPossible(new ISoigneur() {

			@Override
			public void soigner() {
				System.out
						.println("Pas de prob, j'ai mon vieux couteau, mais je ne garantis pas le travail, hahahaha!");

			}
		});
		p.soigner();
	}
}
