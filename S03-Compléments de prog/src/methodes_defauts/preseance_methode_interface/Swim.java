package methodes_defauts.preseance_methode_interface;

public interface Swim {

	default void backStroke() {
		System.out.println("Swim.backStroke");
	}
}