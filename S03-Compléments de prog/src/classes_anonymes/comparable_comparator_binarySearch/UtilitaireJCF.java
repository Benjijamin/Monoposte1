package classes_anonymes.comparable_comparator_binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilitaireJCF {

	public static void main(String[] args) {

		System.out.println("\nSort \n\n");
		List<ComparableItem> itemList = new ArrayList<>();
		itemList.add(new ComparableItem("item1", 0.5f, 111, Item.ItemType.CONSERVE));
		itemList.add(new ComparableItem("item5", 1.5f, 222, Item.ItemType.CONSERVE));
		itemList.add(new ComparableItem("item3", 0.2f, 333, Item.ItemType.FRAIS));
		itemList.add(new ComparableItem("item8", 1.7f, 444, Item.ItemType.FRAIS));
		itemList.add(new ComparableItem("item3", 0.2f, 555, Item.ItemType.FRAIS));
		itemList.add(new ComparableItem("item4", 1.7f, 666, Item.ItemType.FRAIS));

		System.out.println("Avant le sort : \n" + itemList);
		Collections.sort(itemList); // selon le compareTo de ComparableItem
		System.out.println("Apres le sort selon le compareTo de ComparableItem, sur le nom : \n" + itemList);

		// Une fois trié on peut rechercher avec binarySearch
		// on doit utiliser un objet
		int index = Collections.binarySearch(itemList, new ComparableItem("item8", 0, 0, null));

		// pour faire la recherche ici seul le nom compte voir methode compareTo de la
		// classe ComparableItem
		Item itemRecherche = itemList.get(index);
		System.out.println("itemRecherche : " + itemRecherche);

		// Pour trier selon un autre ordre (le numéro de série) on utilise un Comparator
		Collections.sort(itemList, new ComparatorSerialNumber());
		System.out.println("Liste triée selon le numéro de série \n" + itemList);

		// OU
		// classe anonyme, selon le poids
		Collections.sort(itemList, new Comparator<ComparableItem>() {

			@Override
			public int compare(ComparableItem o1, ComparableItem o2) {
				return (int) ((o1.getPoids() - o2.getPoids()) * 1000);
			}
		});

		System.out.println("Liste triée selon le poids \n" + itemList);

		// classe anonyme
		int index2 = Collections.binarySearch(itemList, new ComparableItem(null, 1.7f, 0, null),
				new Comparator<Item>() {

					@Override
					public int compare(Item o1, Item o2) {
						return (int) ((o1.getPoids() - o2.getPoids()) * 1000);
					}

				});

		Item itemRecherche2 = itemList.get(index2);
		System.out.println(itemRecherche2);
	}
}
