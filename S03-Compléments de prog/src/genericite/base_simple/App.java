package genericite.base_simple;

import java.util.ArrayList;

// https://openclassrooms.com/courses/apprenez-a-programmer-en-java/la-genericite-en-java

public class App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// SOLO !!
		Solo<Integer> val = new Solo<>(12);
		int nbre = val.getValeur();
		System.out.println("nbre : " + nbre);
		

		// Ne fonctionne pas, on essaie de mettre une chaîne de caractères à la place
		// d'un entier
		// Solo<Integer> val2 = new Solo<>("toto");
		// int nbre = val2.getValeur();

		// Ne fonctionne pas, on essaie de mettre un nombre à virgule flottante à la
		// place d'un entier
		// Solo<Integer> val3 = new Solo<>(12);
		// val3.setValeur(12.2f);

		Solo<String> valS = new Solo<>("TOTOTOTO");
		Solo<Float> valF = new Solo<>(12.2f);
		Solo<Double> valD = new Solo<>(12.202568);
		System.out.println(valS.getValeur() + " - " + valF.getValeur() + " - " + valD.getValeur());

		// l'autoboxing
		// depuis Java 5, est géré ce qu'on appelle l'autoboxing, une fonctionnalité du
		// langage permettant de transformer automatiquement un type primitif en classe
		// wrapper (on appelle ça le "boxing") et inversement, c'est-à-dire une classe
		// wrapper en type primitif (ceci s'appelle "l'unboxing"). Ces deux
		// fonctionnalités forment l'autoboxing.

		int i = new Integer(12); // Est équivalent à int i = 12
		double d = new Double(12.2586); // Est équivalent à double d = 12.2586
		Double d2 = 12.0;
		Character c = 'C';
		ArrayList<Integer> liste = new ArrayList<>();
		// Avant Java 5 il fallait faire al.add(new Integer(12))
		// Depuis Java 5 il suffit de faire
		liste.add(12);
		liste.add(new Integer(12));
		System.out.println("Liste al : " + liste);

		// DUO
		Duo<String, Boolean> dual = new Duo<String, Boolean>("toto", true);
		System.out.println("Valeur de l'objet dual : val1 = " + dual.getValeur1() + ", val2 = " + dual.getValeur2());

		Duo<Double, Character> dual2 = new Duo<Double, Character>(12.2585, 'C');
		System.out.println("Valeur de l'objet dual2 : val1 = " + dual2.getValeur1() + ", val2 = " + dual2.getValeur2());

	}
}
