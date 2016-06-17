package ua.khnue.Sheiko03;

import java.util.Random;

/**
 * Utility class
 * @author admin
 *
 */
public class Helpers {

	private Helpers() {
		
	}
	
	public static Object getRndValue(String vtype, int vlength) {	
		Random randomGenerator = new Random();

		switch(vtype) {
			case "String":
				String[] symbols = "abcdefghijklmnopqrstuvwxyz".split("");
			    String randomStr = "";
			    for(int i = 0; i < vlength; ++i) {
			    	randomStr += symbols[randomGenerator.nextInt(symbols.length)];
			    }
				return randomStr;
			case "int":
				return randomGenerator.nextInt((int)Math.pow(10, vlength));
			case "double":
				return randomGenerator.nextInt((int)Math.pow(10, vlength)) / 1000.0;
				
		}
		return false;
	}
}
