package fr.estiam.utils;

import java.util.Random;

public class Utils {

	
	public static String gererate() {
		Random rand = new Random();

		String str="";
		for(int i = 0 ; i < 6 ; i++){
		 char c = (char)(rand.nextInt(26) + 97);
		 str += c;
		}
		return str;
	}
	
	public static int genererNombreA6Chiffres() {
	    Random random = new Random();
	    int nombre = random.nextInt(900000) + 100000;
	    return nombre;
	}
}
