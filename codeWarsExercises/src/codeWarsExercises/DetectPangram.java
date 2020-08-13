package codeWarsExercises;

public class DetectPangram {

	public static void main(String[] args) {
		System.out.println(check2("The quick brown fox jumps over the lazy dog"));
	}
	
	 public static boolean check(String sentence){
		    boolean[] mark = new boolean[26];
		    
		    int index = 0;
		    
		    for(int i = 0; i < sentence.length(); i++) {
		    	if('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z') {
		    		index = sentence.charAt(i) - 'A';
		    	}
		    	else if('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z') {
		    		index = sentence.charAt(i) - 'a';
		    	}
		    	else 
		    		continue;
		    		mark[index] = true;
		    }
		    
		    for(int i = 0; i <= 25; i++) {
		    	if(mark[i] == false) {
		    		return false;
		    	}
		    }
		    
		    return true;
		  }
	 
	//better way 
	 public static boolean check2(String sentence){
		    return sentence.chars()
		    		.map(Character::toLowerCase)
		    		.filter(Character::isAlphabetic).
		    		distinct().count() == 26;
		  }
	 
	 /*A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.*/
}
