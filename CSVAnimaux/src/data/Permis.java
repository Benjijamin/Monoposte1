package data;

import java.util.Date;

public class Permis extends Enregistrement{
	private int numero;
	private String dateDebut;
	private String dateFin;
	
	public Permis(int numero, String dateDebut, String dateFin) {
		this.numero = numero;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
}
