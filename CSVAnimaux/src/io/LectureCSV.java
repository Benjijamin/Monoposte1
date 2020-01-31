package io;

import java.io.*;
import java.util.*;
import data.*;

public class LectureCSV {

	public boolean lireCSV(Queue<Enregistrement> listeEnregistrement, String path) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String ligne;

			// jete l'entete
			br.readLine();

			while ((ligne = br.readLine()) != null) {
				String[] data = ligne.split("\"?,\"?|\"");
				
				
				Permis permis = new Permis(
						toInt(data[0]),
						data[1],
						data[2]);
				
				listeEnregistrement.add(permis);
				
				Gardien gardien = new Gardien(data[3]);

				listeEnregistrement.add(gardien);
				
				Animal animal = new Animal(data[4], data[5], toBool(data[6]), data[7], data[8], toBool(data[9]), toBool(data[10]), toInt(data[11]), toBool(data[12]), toBool(data[13]));

				listeEnregistrement.add(animal);
				
			}

		} catch (IOException e) {
		} catch (Exception e) {
			System.err.println("Oops");
		}

		return true;
	}
	
	private int toInt(String s) {
		return Integer.parseInt(s);
	}
	
	private boolean toBool(String s) {
		return s == "1";
	}

}
