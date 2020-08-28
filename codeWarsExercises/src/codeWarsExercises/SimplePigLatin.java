package codeWarsExercises;

import java.util.ArrayList;
import java.util.List;

public class SimplePigLatin {

	public static void main(String[] args) {
		System.out.println(pigIt2("Hello World !"));
	}

	public static String pigIt(String str) {
		String[] words = str.split(" ");
		List<String> list = new ArrayList<>();
		String latinWord = "";

		for (int i = 0; i < words.length; i++) {
			char firstChar = words[i].charAt(0);
			String rest = words[i].substring(1, words[i].length());

			if (!Character.isLetterOrDigit(firstChar)) {
				latinWord = firstChar + "";
			} else {
				latinWord = rest + firstChar + "ay";
			}
			list.add(latinWord);
		}
		String result = String.join(" ", list);
		return result;
	}

	// Better way
	public static String pigIt2(String str) {
		return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
	}

	/*
	 * Move the first letter of each word to the end of it, then add "ay" to the end
	 * of the word. Leave punctuation marks untouched.
	 * 
	 * Examples pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
	 * pigIt('Hello world !'); // elloHay orldway !
	 */
}
