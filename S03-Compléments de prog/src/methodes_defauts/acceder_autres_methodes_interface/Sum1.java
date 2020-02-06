package methodes_defauts.acceder_autres_methodes_interface;

public class Sum1 implements Summable1 {
	@Override
	public int getA() {
		return 1;
	}

	@Override
	public int getB() {
		return 2;
	}
}