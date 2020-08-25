package codeWarsExercises;

public class DashatizeIt {

	public static void main(String[] args) {
		System.out.println(dashatize2(Integer.MAX_VALUE));
	}

	public static String dashatize(int num) {
		String numStr = "" + num;
		if (numStr.startsWith("-")) {
			numStr = numStr.substring(1, numStr.length());
		}
		String result = "";

		for (int i = 0; i < numStr.length(); i++) {
			String position = numStr.substring(i, i + 1);
			int number = Integer.parseInt(position);

			if (number % 2 != 0) {
				result += "-" + position + "-";
			} else {
				result += position;
			}
		}

		numStr = result.replace("--", "-");

		if (numStr.startsWith("-")) {
			numStr = numStr.substring(1, numStr.length());
		}

		if (numStr.endsWith("-")) {
			numStr = numStr.substring(0, numStr.length() - 1);
		}

		return numStr;
	}

	// Better way
	public static String dashatize2(int num) {
		return Integer.toString(num).replaceAll("([13579])", "-$1-").replaceAll("--", "-").replaceAll("^-", "")
				.replaceAll("-$", "");
	}

	/*
	 * Given a number, return a string with dash'-'marks before and after each odd
	 * integer, but do not begin or end the string with a dash mark.
	 * 
	 * Ex:
	 * 
	 * dashatize(274) -> '2-7-4' dashatize(6815) -> '68-1-5'
	 */
}
