package codeWarsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class encryptThis {

	public static void main(String[] args) {
		System.out.println(encryptThis2("Hello World"));
		System.out.println(encryptThis("Hello World"));
	}

	public static String encryptThis(String text) {

		if (text == null || text == "") {
			return "";
		}

		String[] palavras = text.split(" ");
		List<String> codificado = new ArrayList<>();
		String encrypt = "";
		String palavraCompleta = "";
		String subStr = "";

		for (int i = 0; i < palavras.length; i++) {
			char primeiraLetra = palavras[i].charAt(0);
			int ascii = primeiraLetra;

			if (palavras[i].length() == 1) {
				palavraCompleta = ascii + "";
			}

			if ((palavras[i].length() == 2)) {
				subStr = palavras[i].substring(1);
				palavraCompleta = ascii + "" + subStr;
			}

			if (palavras[i].length() >= 3) {
				char segundaLetra = palavras[i].charAt(1);
				char ultimaLetra = palavras[i].charAt(palavras[i].length() - 1);

				subStr = palavras[i].substring(2, palavras[i].length() - 1);
				palavraCompleta = ascii + "" + ultimaLetra + subStr + segundaLetra;
			}
			codificado.add(palavraCompleta);
		}
		encrypt = String.join(" ", codificado);
		return encrypt;
	}

	// Better way

	public static String encryptThis2(String text) {
		return Arrays.stream(text.split(" ")).map(w -> w.length() > 2
				? (int) w.charAt(0) + w.substring(w.length() - 1) + w.substring(2, w.length() - 1) + w.substring(1, 2)
				: w.length() > 1 ? (int) w.charAt(0) + w.substring(1) : w.length() == 1 ? (int) w.charAt(0) + "" : "")
				.collect(Collectors.joining(" "));
	}

	/*
	 * you want to create secret messages which can be deciphered by the Decipher
	 * this! kata. Here are the conditions:
	 * 
	 * Your message is a string containing space separated words. You need to
	 * encrypt each word in the message using the following rules: The first letter
	 * needs to be converted to its ASCII code. The second letter needs to be
	 * switched with the last letter Keepin' it simple: There are no special
	 * characters in input.
	 */
}
