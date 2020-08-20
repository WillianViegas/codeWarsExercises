package codeWarsExercises;

public class IsANumberPrime {

	public static void main(String[] args) {
		System.out.println(isPrime2(5099));
	}

	public static boolean isPrime(int num) {
		if (num <= 0 || num == 1) {
			return false;
		}

		if (num == 2) {
			return true;
		}

		int divisaoMaxima = (int) (Math.sqrt(num) + 1);
		for (int i = 2; i <= divisaoMaxima; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Better way

	public static boolean isPrime2(int num) {
		return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(20);
	}

	/*
	 * Define a function that takes an integer argument and returns logical value
	 * true or false depending on if the integer is a prime.
	 * 
	 * Per Wikipedia, a prime number (or a prime) is a natural number greater than 1
	 * that has no positive divisors other than 1 and itself.
	 * 
	 * Requirements You can assume you will be given an integer input. You can not
	 * assume that the integer will be only positive. You may be given negative
	 * numbers as well (or 0). NOTE on performance: There are no fancy optimizations
	 * required, but still the most trivial solutions might time out. Numbers go up
	 * to 2^31 (or similar, depends on language version). Looping all the way up to
	 * n, or n/2, will be too slow. 
	 * Example is_prime(1) false 
	 * is_prime(2) true
	 * is_prime(-1) false
	 */
}
