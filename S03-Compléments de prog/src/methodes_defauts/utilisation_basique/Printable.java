package methodes_defauts.utilisation_basique;

/**
 * Interface with default method
 */
public interface Printable {
	default void printString() {
		System.out.println("default implementation");
	}
}
