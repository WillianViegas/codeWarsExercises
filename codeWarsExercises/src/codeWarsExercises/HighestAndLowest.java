package codeWarsExercises;

import java.util.Arrays;

public class HighestAndLowest {

	public static void main(String[] args) {

		System.out.println(highAndLow("-1 -1"));
	}

	public static String highAndLow(String numbers) {
		String[] array = numbers.split(" ");
		int maior = 0;
		int menor = 0;
		
		for(int i = 0; i < array.length; i++) {
			int n = Integer.parseInt(array[i]);
			
			if(i == 0) {
				maior = n;
				menor = n;
			}
			
			if(n > maior) {
				maior = n;
			}
			
			if(n < menor) {
				menor = n;
			}
		}
		
		String resultado = maior + " " + menor;
		return resultado;
	}
	
	//Better way
	public static String highAndLow2(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .min()
                        .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .max()
                        .getAsInt();

        return String.format("%d %d", max, min);
    }
	
	//In this little assignment you are given a 
	//string of space separated numbers, and have to return the highest and lowest number.
}
