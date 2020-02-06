package methodes_defauts.utilisation_basique;

/**
 * Custom implementation of {@link #printString()}
 */
public class OverrideDefault implements Printable {

	@Override
	public void printString() {
		System.out.println("overridden implementation");
	}
}