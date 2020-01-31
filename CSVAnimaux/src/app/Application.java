package app;

import java.util.*;

import data.*;

public class Application {

	public static void main(String[] args) {
		String s = "1234,\"bonjour\",\"salut\"";
		String[] tab = s.split("\"?,\"?|\"");
		for (String str : tab) {
			System.out.println(str);
		}
		
	}

}
