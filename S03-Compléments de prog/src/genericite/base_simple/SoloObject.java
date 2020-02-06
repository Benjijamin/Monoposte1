package genericite.base_simple;

public class SoloObject {

	private Object objet;

	public SoloObject(Object objet) {
		super();
		this.objet = objet;
	}

	public Object getObjet() {
		return objet;
	}

	public void setObjet(Object objet) {
		this.objet = objet;
	}

	public static void main(String[] args) {

		SoloObject un = new SoloObject(12);

		int entier = (int) un.getObjet();
		System.out.println(entier);
	}

}
