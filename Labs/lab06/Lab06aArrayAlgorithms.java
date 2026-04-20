package Labs.lab06;
import java.util.Arrays;

public class Lab06aArrayAlgorithms {

	/**
	 * Determines if the input parameter number is a prime number
	 * @param number
	 *		Precondition: number >= 1
	 * @return: true if number is a prime, otherwise, false
	 */
	public static boolean isPrime (int number) {
		
		/* INSERT YOUR CODE BELOW THESE COMMENTS
		*/
		
		
		return true;
	}


	/***** PART A - PARTICULAR PROPERTY - AT LEAST ONE | ALL | NUMBER OF PRIMES ***********/

	/**** PART A-1 hasAtLeastOnePrime ****/
	/**
	 * Determines if the given array has at least one element that is a prime number
	 * @param arr
	 *		Precondition - arr is not null; arr.length is >= 1
	 * @return true if array arr has at least one element that is a prime number
	 */
	public static boolean hasAtLeastOnePrime(int[] arr) {

		/* INSERT YOUR CODE BELOW THESE COMMENTS
		 * Implement this with a for each loop (enhanced for loop)
		 * Call isPrime to determine if a number is a prime
		 */
		

		return false;
	}
	
	/**** PART A-2 allElemsArePrimes ****/
	/**
	 * Determines if the given array has elements that are all prime numbers
	 * @param arr
	 *		Precondition - arr is not null; arr.length is >= 1
	 * @return true if array arr has elements that are all prime numbers
	 */
	public static boolean allElemsArePrimes(int[] arr) {

		/* INSERT YOUR CODE BELOW THESE COMMENTS
		 * Implement this with a for each loop (enhanced for loop)
		 * Call NumberProperties.isPrime to determine if a number is a prime
		 */

		
		return true;
	}
	

	/****  PART A-3 numberOfPrimes ****/
	/**
	 * Determines the number of prime numbers in the given array
	 * @param arr
	 *		Precondition - arr is not null; arr.length is >= 1
	 * @return an integer value that is the number of prime numbers in array arr
	 */
	public static int numberOfPrimes (int[] arr) {

		int count = 0;

		/* INSERT YOUR CODE BELOW THESE COMMENTS
		 * Implement this with a for each loop (enhanced for loop)
		 * Call NumberProperties.isPrime to determine if a number is a prime
		 */
		
		
		return count;
	}
	
	/********** PART B: CONSECUTIVE PAIRS - noMoreThanThree *******************************/

	/**
	 * Determines if every pair of adjacent numbers in the given array has a difference that is no more than 3
	 * @param arr
	 *		Precondition - arr is not null; arr.length is >= 1
	 * @return true if every consecutive pair of numbers in array arr has a difference that is no more than 3
	 */
	public static boolean pairDiffNoMoreThanThree (int[] arr) {

		/* INSERT YOUR CODE BELOW THESE COMMENTS
		 * Hint: Implement this with an indexed for loop
		 */

		
		return true;
	}

	
	/****************** BEGIN TEST METHODS ************************/

	/***************** DO NOT CHANGE THESE ************************/
	private static int[][] arrsForPrimes = {{1, 2, 3, 7, 9, 10}, {1, 4, 10, 9}, {1, 2, 10, 9}, {3, 37, 101, 103},
			{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}};

	public static  void testHasAtLeastOnePrime() {
		System.out.println("\n******** TESTING hasAtLeastOnePrime ****\n");
		boolean[] hasAtLeastOnePrimeExpected = {true, false, true, true, true};
		int numSuccesses = 0;
		for (int i = 0; i < arrsForPrimes.length; i++) {
			boolean res = hasAtLeastOnePrime(arrsForPrimes[i]);
			System.out.print("Testing array " + i + ": ");
			System.out.println(Arrays.toString(arrsForPrimes[i]));
			boolean success = res==hasAtLeastOnePrimeExpected[i];
			System.out.print(" - with method hasAtLeastOnePrime: This array has at least one prime: " + res + ".");
			if (success) {System.out.println(" SUCCESS :)"); numSuccesses++;}
			else {System.out.println(" FAILURE :(");}
		}
		System.out.println();
		System.out.println("Score of successful tests = " + numSuccesses + "/" + arrsForPrimes.length);
	}

	public static  void testAllElemsArePrimes() {
		System.out.println("\n******** TESTING allElemsArePrimes ****\n");
		boolean[] allElemsArePrimesExpected = {false, false, false, true, false};
		int numSuccesses = 0;
		for (int i = 0; i < arrsForPrimes.length; i++) {
			boolean res = allElemsArePrimes(arrsForPrimes[i]);
			System.out.print("Testing array " + i + ": ");
			System.out.println(Arrays.toString(arrsForPrimes[i]));
			boolean success = res==allElemsArePrimesExpected[i];
			System.out.print(" - with method hasAtLeastOnePrime: This array has only primes: " + res + ".");
			if (success) {System.out.println(" SUCCESS :)"); numSuccesses++;}
			else {System.out.println(" FAILURE :(");}
		}
		System.out.println();
		System.out.println("Score of successful tests = " + numSuccesses + "/" + arrsForPrimes.length);
	}

	public static  void testNumberOfPrimes() {
		System.out.println("\n******** TESTING numberOfPrimes ****\n");
		int[] numberOfPrimesExpected = {3, 0, 1, 4, 8};
		int numSuccesses = 0;
		for (int i = 0; i < arrsForPrimes.length; i++) {
			int res = numberOfPrimes(arrsForPrimes[i]);
			System.out.print("Testing array " + i + ": ");
			System.out.println(Arrays.toString(arrsForPrimes[i]));

			boolean success = res==numberOfPrimesExpected[i];
			System.out.print(" - with method numberOfPrimes: This array has " +
					res + " primes. (Expected number: " +
					numberOfPrimesExpected[i] + ".)");
			if (success) {System.out.println(" SUCCESS :)"); numSuccesses++;}
			else {System.out.println(" FAILURE :(");}
		}		
		System.out.println();
		System.out.println("Score of successful tests = " + numSuccesses + "/" + arrsForPrimes.length);
	}

	public static void testPairDiffNoMoreThanThree() {
		System.out.println("\n**** TESTING method pairDiffNoMoreThanThree *****\n");	
		int[][] arrs = {
				{1, 4, 7, 9, 11, 12, 13, 13, 13},
				{1, 1, 1, 1, 1},
				{1, -1, 0, -1, 2, 4},
				{21, 22, 24, 26, 31, 31, 32},
				{21, 22, 24, 27, 30, 27, 25}
		};
		boolean[] expectedRes = {true, true, true, false, true};
		int numSuccesses = 0;
		for (int i=0; i < arrs.length; i++) {
			boolean res = pairDiffNoMoreThanThree(arrs[i]);
			System.out.print("Testing array " + i + ": ");
			System.out.println(Arrays.toString(arrs[i]));
			System.out.print("Expected result: " + expectedRes[i] +"; Actual result: " + res + "; ");
			if (res==expectedRes[i]) {
				System.out.println("SUCCESS!");
				numSuccesses++;
			}
			else
				System.out.println("FAILURE!");
		}
		System.out.println();
		System.out.println("Score of successful tests = " + numSuccesses + "/" + arrs.length);
	}
	
		
	public static void main(String[] args) {
		
		testHasAtLeastOnePrime();
		testAllElemsArePrimes();
		testNumberOfPrimes();
		testPairDiffNoMoreThanThree();

	}
	

}