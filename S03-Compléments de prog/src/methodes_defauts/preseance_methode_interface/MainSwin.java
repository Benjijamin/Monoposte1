package methodes_defauts.preseance_methode_interface;

/**
 * Les impl�mentations dans les classes, y compris les d�clarations abstraites,
 * ont priorit� sur toutes les valeurs par d�faut de l'interface.
 */
public class MainSwin {

	public static void main(String[] args) {
		new FooSwimmer1().backStroke();
		new FooSwimmer2().backStroke();
	}
}