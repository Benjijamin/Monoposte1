package methodes_defauts.methodes_defaut_remplacees;

public interface Fooable {
	default int foo() {
		return 3;
	}
}
