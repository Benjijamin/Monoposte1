package genericite.heritageEtGenericite;

import java.util.ArrayList;
import java.util.List;

public class App3 {

	public static void main(String[] args) {
		// Liste de voiture
		List<Voiture> listVoiture = new ArrayList<Voiture>();
		listVoiture.add(new Voiture());
		listVoiture.add(new Voiture());

		List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
		listVoitureSP.add(new VoitureSansPermis());
		listVoitureSP.add(new VoitureSansPermis());

		List<Object> listObject = new ArrayList<Object>();
		listObject.add(new Object());
		listObject.add(new Object());

		List<Personne> listPersonne = new ArrayList<Personne>();
		listPersonne.add(new Personne("Dom", "Homme", 6.3));
		listPersonne.add(new Personne("Caro", "Femme", 5.8));

		affiche(listVoiture);
		affiche(listVoitureSP);
		affiche(listObject);
		affiche(listPersonne);
	}

	// Avec cette méthode, on accepte toutes les classes définies par le paramètre
	// générique utilisé à la déclaration
	static void affiche(List<?> list) {
		for (Object v : list)
			System.out.println(v);
	}
}
