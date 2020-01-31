package app;

import java.util.*;
import data.*;
import io.*;

public class Application {

	public static void main(String[] args) {
		
		
		Queue<Enregistrement> q = new LinkedList<Enregistrement>();
		LectureCSV l = new LectureCSV();
		l.lireCSV(q, "permis-animaux.csv");
		
		for(Enregistrement e: q) {
			System.out.println(e);
		}
		
	}

}
