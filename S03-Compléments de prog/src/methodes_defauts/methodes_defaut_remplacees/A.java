package methodes_defauts.methodes_defaut_remplacees;

public class A extends Object implements Fooable {

	/**
	 * Dans les classes, super.foo() recherchera uniquement les superclasses. Si
	 * vous souhaitez appeler une impl�mentation par d�faut � partir d'une
	 * superinterface, vous devez vous qualifier "super" avec le nom de l'interface:
	 * Fooable.super.foo()
	 */
	@Override
	public int foo() {
		// return super.foo() + 1; //error: no method foo() in java.lang.Object
		return Fooable.super.foo() + 1; // okay, returns 4
	}
}
