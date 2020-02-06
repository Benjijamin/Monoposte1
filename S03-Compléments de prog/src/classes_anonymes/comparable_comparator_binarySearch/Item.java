package classes_anonymes.comparable_comparator_binarySearch;

import java.io.Serializable;

public class Item implements Serializable {

	private static final long serialVersionUID = 1L;

	public enum ItemType {
		FRUIT, LEGUME, CONSERVE, FRAIS
	};

	protected String nom;
	private float poids;
	private int serialNumber;
	private ItemType itemType;

	public Item(String nom, float poids, int serialNumber, ItemType itemType) {
		super();
		this.nom = nom;
		this.poids = poids;
		this.serialNumber = serialNumber;
		this.itemType = itemType;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + serialNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (serialNumber != other.serialNumber)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return nom + " poids: " + poids + " SN: " + serialNumber + " type: " + itemType + "\n";
	}
}