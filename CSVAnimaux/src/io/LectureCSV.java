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
				String[] data = ligne.split("\",");
				
				for(int i = 0; i < data.length;i++) {
					data[i] = data[i].replace("\"","").replace(",", "");
					System.out.println(data[i]);
				}
				
				System.out.println(data[0]);
				Permis permis = new Permis(
						toInt(data[0]),
						data[1],
						data[2]);
				
				listeEnregistrement.add(permis);
				
				Gardien gardien = new Gardien(data[3]);

				listeEnregistrement.add(gardien);
				
				Animal animal = new Animal(
						data[4],
						data[5],
						toBool(data[9]),
						data[10],
						data[11],
						toBool(data[12]),
						toBool(data[13]),
						toInt(data[14]),
						toBool(data[15]),
						toBool(data[16]));

				listeEnregistrement.add(animal);
			}

		} catch (IOException e) {
		} catch (Exception e) {
			System.err.println("Oops");
			e.printStackTrace();
			return false;
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
