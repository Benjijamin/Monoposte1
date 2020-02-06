package classes_anonymes.comparable_comparator_binarySearch;

public class ComparableItem extends Item implements Comparable<ComparableItem> {

	private static final long serialVersionUID = 7169373980361196940L;

	public ComparableItem(String nom, float poids, int serialNumber, ItemType itemType) {
		super(nom, poids, serialNumber, itemType);
	}

	@Override
	public int compareTo(ComparableItem o) {
		// ne compare que le nom
		//System.out.println("Je compare dans " + this.getClass().getName());
		return nom.compareTo(o.getNom());
	}

}
