package codeWarsExercises;

import java.util.ArrayList;
import java.util.List;

public class ConvertStringToCamelCase {

	public static void main(String[] args) {
		System.out.println(toCamelCase("The-Stealth-Warrior"));
	}
	static String toCamelCase(String s) {
		boolean underLine = s.contains("_");
		boolean traco = s.contains("-");
		String[] words= {};
		
		if(traco == true) {
			words = s.split("-");			
		}
		
		if(underLine == true) {
			words = s.split("_");
		}
		
		List<String> listWords = new ArrayList<>();
		String result = "";
		for(int i = 0; i < words.length; i++) {
			if(i > 0) {
				String character = words[i].substring(0,1).toUpperCase();
				String word = words[i].substring(1);
				String concatening = character.concat(word);
				result = concatening;
			}
			else {
				result = words[i];
			}
			listWords.add(result);
		}
		
		String camelPhrase = String.join("", listWords);
		return camelPhrase;
	}
	
	/*Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).

	Examples
	toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"

	toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"*/
}
