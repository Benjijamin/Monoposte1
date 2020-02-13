package cas1;

import cas1.exceptions.ElementPleinException;

public class BufferCirculaire {

	public int size;
	public Noeud first;
	public Noeud last;

	public BufferCirculaire(int taille) {
		this.size = taille;
		Noeud courant = null;
		Noeud dernier = null;
		first = last = courant = dernier = new Noeud(null);

		for (int i = 1; i < taille; i++) {
			courant = new Noeud(null);
			dernier.next = courant;
			dernier = courant;
		}

		courant.next = first;
	}

	public void add(Object value) {
		if (first.data == null) {
			first.data = value;
		} else {
			throw new ElementPleinException();
		}
	}

	public void remove() {

	}

	public String toString() {
		String s = "";
		Noeud courant = first;
		do {
			s += courant.data + " ";
			courant = courant.next;
		} while (courant != first);
		return s;
	}

	private class Noeud {
		Noeud prev;
		Noeud next;
		Object data;

		Noeud(Object data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		
		BufferCirculaire b = new BufferCirculaire(3);
		b.add("123");
		b.add("345");
		b.add("678");
		System.out.println(b);
	}
}
