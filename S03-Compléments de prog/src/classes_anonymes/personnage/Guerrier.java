package classes_anonymes.personnage;

public class Guerrier extends Personnage {

	public Guerrier(String nom, int age) {
		super(nom, age);
	}

	@Override
	public void manger() {
		System.out.println("Je mange très mal! Hahahaha!");
	}
}
