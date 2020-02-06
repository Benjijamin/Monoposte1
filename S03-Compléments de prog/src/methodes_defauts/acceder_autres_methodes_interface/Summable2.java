package methodes_defauts.acceder_autres_methodes_interface;

public interface Summable2 {
	static int getA() {
		return 1;
	}

	static int getB() {
		return 2;
	}

	default int calculateSum() {
		return getA() + getB();
	}
}
