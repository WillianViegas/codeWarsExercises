package codeWarsExercises;

import java.util.stream.Stream;

public class ShortestWord {

	public static void main(String[] args) {
		System.out.println(findShort("turns out random test cases ar easier than writing out basic ones"));

	}

	  public static int findShort(String s) {
		  String[] words = s.split(" ");
		  int size = words.length; 
		  int word;
		  
		  for(int i = 0; i < words.length; i++) {
			  
			  word = words[i].length();
			  if(size > word) {
				  size = word;
			  }
		  }
		  return size;
	    }
	 
	  //better way
	  public static int findShort2(String s) {
	        return Stream.of(s.split(" "))
	          .mapToInt(String::length)
	          .min()
	          .getAsInt();
	    }
	  
	  /*Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.*/
}
