package genericite.heritageEtGenericite;

import java.util.ArrayList;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		// Liste de voiture
		List<Voiture> listVoiture = new ArrayList<Voiture>();
		listVoiture.add(new Voiture());
		listVoiture.add(new Voiture());
		listVoiture.add(new VoitureSansPermis());

		List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
		listVoitureSP.add(new VoitureSansPermis());
		listVoitureSP.add(new VoitureSansPermis());

		List<Object> listObject = new ArrayList<Object>();
		listObject.add(new Object());
		listObject.add(new Object());

		affiche(listVoiture);
		//affiche(listVoitureSP);
		affiche(listObject);
	}

	// Avec cette méthode, on accepte les collections de Voiture et toutes les
	// collections d'Object, superclasse de Voiture

	static void affiche(List<? super Voiture> list) {
		for (Object v : list)
			System.out.println(v.toString());
	}
}
