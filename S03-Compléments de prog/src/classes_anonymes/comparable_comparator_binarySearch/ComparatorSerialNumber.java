package classes_anonymes.comparable_comparator_binarySearch;

import java.util.Comparator;

public class ComparatorSerialNumber implements Comparator<ComparableItem> {

	@Override
	public int compare(ComparableItem o1, ComparableItem o2) {
		return (int) (o1.getSerialNumber() - o2.getSerialNumber());
	}
}