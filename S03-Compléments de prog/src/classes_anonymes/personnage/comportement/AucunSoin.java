package classes_anonymes.personnage.comportement;

public class AucunSoin implements ISoigneur {

	@Override
	public void soigner() {
		System.out.println("Je soigne personne!");
	}
}
