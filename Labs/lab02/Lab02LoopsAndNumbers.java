package Labs.lab02;

/**
 * In this program, you will write a method called Lab02aNumberSequencesAndSeries to implement a
 * few simple algorithms using loops. 
 */


public class Lab02LoopsAndNumbers {

	static int numPassed = 0;
	static int testGrpNum = 0;
	static int total = 15;

	/**EXERCISE 1:
	 * This method returns the sum of all numbers between 1 and 100 (inclusive)
	 * @return an int value as described above.
	 */
	public static int sumN1ToN2 (int n1, int n2) {
		int sum = 0;
		
		/* Write your code to determine the sum of all numbers between 1 and 100 (inclusive) */
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }

		/* Return the calculated sum */
		return sum;
	}

	/**EXERCISE 2:
	 * This method returns the sum of all even numbers between n1 and n2 (inclusive)
	 * @return an int value as described above.
	 * PRECONDITION: assume that n1 and n2 are even numbers
	 */
	public static int sumEvenNumbersN1ToN2 (int n1, int n2) {
		int sum = 0;
		
		/* Write your code to determine the sum of all even numbers between n1 and n2 (inclusive) */
        for (int i = n1; i <= n2; i += 2) {
            sum += i;
        }
		
		/* Return the calculated sum instead of 0 */
		return sum;
	}
	
	/**EXERCISE 3:
	 * This method returns the sum of the squares of all numbers between 1 and n (inclusive)
	 * @param n - an int value to indicate the last number in the list
	 * @return an int value as described above.
	 */
	public static int sumSquaresOfNumbers (int n) {
		int sum = 0;

		/* Write your code to determine the sum of the squares of all numbers between 1 and 10 (inclusive) */
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
		
		/* Return the calculated sum instead of 0 */
		return sum;
	}
	
	/**EXERCISE 4:
	 * This method returns a String that lists the squares of numbers from 1 to n,
	 * inclusive. The list should be separated by commas, with no comma after the last item.
	 * @param n - an int value to indicate the last number in the list
	 * @return a String value as described above.
	 */
	public static String listSquaresOfNumbers(int n) {
		String res = "";
		
		/* Write your code to create a string res containing a comma-separated list of numbers
		 * as described above.
		 * Example: if n is 10, the string should look like this: "1, 4, 9, 16, ..., 100".
		 * Modify your code so that it does not need to use the * multiplication operator or
		 * the Math.pow() method. Hint: Look at the differences between adjacent numbers.
		 * To get the formatting right, you will need to use String.format(" %5d", someIntVariable).
		 * Note also that there are 5 numbers on each line, so you'll need to insert \n where appropriate.
		 */
        int targ = 1;
        int vary = 3;

        for (int i = 1; i <= n; i++) {
            res += String.format(" %5d", targ);
            if (i < n){
                if (i%5 != 0){
                    res += ", ";
                } else {
                    res += ",";
                }
            }
            if (i % 5 == 0 && i < n){
                res += "\n";
            }
            targ += vary;
            vary += 2;
        }
		
		/* Return the created string instead of the empty string */
		return res;
	}
	



	/**EXERCISE 5A:
	 * Write a method containing that uses a loop to create and return the following string:
	 * "-4, 14, 32, 50, ..."
	 * @param totalCount - the number of terms in the sequence
	 * The for loop statement must begin like this:
	 *         for (int i = 1; i <= totalCount; i++)
	 * @ return a String value as described above
	 */
	public static String listLinearSequenceA (int totalCount) {
		String res = "";
		
		/* Write your code here to generate the linear sequence and store it in res */
		int num = -4;
        for (int i = 1; i <= totalCount; i++) {
            res += num;
            if (i < totalCount) {
                res += ", ";
            }
            num += 18;
        }
		
		/* Return the updated string */
		return res;
	}
	

	/**EXERCISE 5B:
	 * Write a method containing that uses a loop to create and return the following string:
	 * "41, 29, 17, 5, -7, ..."
	 * @param totalCount - the number of terms in the sequence
	 * The for loop statement must begin like this:
	 *         for (int i = 1; i <= totalCount; i++)
	 * @ return a String value as described above
	 */
	public static String listLinearSequenceB (int totalCount) {
		String res = "";

		/* Write your code here to generate the linear sequence and store it in res */
		int num = 41;
        for (int i = 1; i <= totalCount; i++) {
            res += num;
            if (i < totalCount) {
                res += ", ";
            }
            num -= 12;
        }
		
		/* Return the updated string */
		return res;
	}

	
	/**EXERCISE 6:
	 * This method returns a String that lists the powers of 3 from 3^0 to 3^n.
	 * The list should be separated by commas, with no comma after the last item.
	 * @param n - an int value to indicate the last exponent for the list of powers of 3 
	 * @return a String value as described above.
	 */
	public static String listPowersOfThree(int n) {

		// Start with empty string s
		String res = "";

		/* Write your code to update the string s so that it contains a comma-separated
		 * list of numbers as described above.
		 * The string should be formatted like this: "1, 3, 9, 27, ..."
		 * without a comma after the last item in the list.
		 */
        int power = 1;
        for (int i = 0; i <= n; i++) {
            res += power;
            if (i < n){
                 res += ", ";
            }
            power *= 3;
        }
		
		/* Return the updated string */
		return res;
	}
	
	
	/**EXERCISE 7:
	 * This method returns a string containing a comma separated list of the
	 * first n numbers in the fibonacci sequence.
	 * @param
	 * @return
	 * PRECONDITION: n is >= 2;
	 */
	static String listFibonacciNumbers(int n) {
		String res = "";
		
		/* Write your code here to update the string s with the Fibonnaci sequence */
        int a = 1;
        int b = 1;
        res = a + ", " + b;
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            res += ", " + next;
            a = b;
            b = next;
        }
		
		/* Return the updated string */
		return res;
	}

	
	/**EXERCISE 8 - PART A:
	 * This is a helper method for listPrimes (see further below).
	 * This method returns a boolean value depending on whether the number is prime.
	 * @param n - a positive int value that is passed in
	 * @return true if the number passed in is a primer number; false otherwise
	 * 
	 * Note: call this method from the listPrimes method below and test it as part of
	 * testing listPrimes.
	 * 
	 * PRECONDITION: n is 0 or positive
	 */
	static boolean isPrime (int n) {
		
		/* Write your code here */
		for (int i = 2; i * i <= n; i++) {
            if (n % i == 0){
                return false;
            }
        }

		return true;
	}
	
	
	/**EXERCISE 8 - PART B:
	 * This method returns a string containing the list of all prime numbers less than or
	 * equal to a number n that is passed in as parameter.
	 * @param capForPrimies - a positive int value that is passed in
	 * @return a string containing a list of all prime numbers less than or
	 * equal to capForPrimes. Each number is formatted so that it occupies no
	 * more than 5 spaces. Also, there is at least a single space between
	 * each number in the list. In addition, no more than 10 numbers should be
	 * on any single line.
	 * For example: 
	 * PRECONDITION: 0 <= capForPrimes <= 99999
	 * 
	 * Note: Call isPrime from within this method.
	 */
	static String listPrimes(int capForPrimes) {
		String res = "";

		/* Write your code here */
        int count = 0;
        for (int i = 2; i <= capForPrimes; i++) {
            if (isPrime(i)) {
                res += String.format("%6d", i);
                count++;
                if (count % 10 == 0){
                    res += "\n";
                }
            }
        }
		
		return res;
	}

	/*
	 * THE TESTING METHODS START HERE; DO NOT TOUCH THESE
	 */

	public static void testSumN1ToN2() {
		int[][] N1ToN2 = { {1, 100}, {151, 200}, {301, 320}};
		int[] sum = {5050, 8775, 6210};
		String[] s = {"The sum of all numbers between ", " and ", " (inclusive) is "};
		String[] expectedRes = {"", "", ""};
		String[] obtainedRes = {"", "", ""};
		for (int i=0; i<=2; i++) {
			expectedRes[i] = s[0] + N1ToN2[i][0] + s[1] + N1ToN2[i][1] + s[2] + sum[i];
			obtainedRes[i] = s[0] + N1ToN2[i][0] + s[1] + N1ToN2[i][1] + s[2] + sumN1ToN2(N1ToN2[i][0], N1ToN2[i][1]);
		}
		testGrpNum++;
		printGroupTitle();
		for (int i=0; i<3; i++) {
			System.out.println("TEST RUN " + testGrpNum + "." + (i+1));
			System.out.println("Expected : " + expectedRes[i]);
			System.out.println("Obtained : " + obtainedRes[i]);
			if (expectedRes[i].equals(obtainedRes[i])) passed(); else failed();
			System.out.println();			
		}
	}

	public static void testSumEvenNumbersN1ToN2() {
		int[][] N1ToN2 = { {92, 100}, {152, 206}, {1002, 2000}};
		int[] sum = {480, 5012, 750500};
		String[] s = {"The sum of all even numbers between ", " and ", " (inclusive) is "};
		String[] expectedRes = {"", "", ""};
		String[] obtainedRes = {"", "", ""};
		for (int i=0; i<=2; i++) {
			expectedRes[i] = s[0] + N1ToN2[i][0] + s[1] + N1ToN2[i][1] + s[2] + sum[i];
			obtainedRes[i] = s[0] + N1ToN2[i][0] + s[1] + N1ToN2[i][1] + s[2] + sumEvenNumbersN1ToN2(N1ToN2[i][0], N1ToN2[i][1]);
		}
		testGrpNum++;
		printGroupTitle();
		for (int i=0; i<3; i++) {
			System.out.println("TEST RUN " + testGrpNum + "." + (i+1));
			System.out.println("Expected : " + expectedRes[i]);
			System.out.println("Obtained : " + obtainedRes[i]);
			if (expectedRes[i].equals(obtainedRes[i])) passed(); else failed();
			System.out.println();			
		}
	}
	
	public static void testSumSquaresOfNumbers() {
		int[] nums = {10, 20};
		int[] sumsOfSquares1ToNum = {385, 2870};
		String[] s = {"The sum of the squares of all numbers between 1 and and ", " (inclusive) is "};
		String[] expectedRes = {"", ""};
		String[] obtainedRes = {"", ""};
		for (int i=0; i<=1; i++) {
			expectedRes[i] = s[0] + nums[i] + s[1] + sumsOfSquares1ToNum[i];
			obtainedRes[i] = s[0] + nums[i] + s[1] + sumSquaresOfNumbers(nums[i]);
		}
		testGrpNum++;
		printGroupTitle();
		for (int i=0; i<2; i++) {
			System.out.println("TEST RUN " + testGrpNum + "." + (i+1));
			System.out.println("Expected : " + expectedRes[i]);
			System.out.println("Obtained : " + obtainedRes[i]);
			if (expectedRes[i].equals(obtainedRes[i])) passed(); else failed();
			System.out.println();			
		}
	}

	public static void testListSquaresOfNumbers() {
		int[] nums = {10, 20};
		String[] s = {"The squares of numbers from 1 to ", " (inclusive) are \n"};
		String[] expectedRes = {"", ""};
		String[] listOfSquares2 = {
				// array row 1:
				"     1,      4,      9,     16,     25,\n" +
				"    36,     49,     64,     81,    100",
				// array row 2:
				"     1,      4,      9,     16,     25,\n" +
				"    36,     49,     64,     81,    100,\n" +
				"   121,    144,    169,    196,    225,\n" +
				"   256,    289,    324,    361,    400"
		};
		String[] obtainedRes = {"", ""};
		for (int i=0; i<=1; i++) {
			expectedRes[i] = s[0] + nums[i] + s[1] + listOfSquares2[i];
			obtainedRes[i] = s[0] + nums[i] + s[1] + listSquaresOfNumbers(nums[i]);
		}
		testGrpNum++;
		printGroupTitle();
		for (int i=0; i<2; i++) {
			System.out.println("TEST RUN " + testGrpNum + "." + (i+1));
			System.out.println("Expected : " + expectedRes[i]);
			System.out.println("Obtained : " + obtainedRes[i]);
			if (expectedRes[i].equals(obtainedRes[i])) passed(); else failed();
			System.out.println();			
		}
	}
	
	public static void testListLinearSequences() {
		String expectedResA = "Linear sequence #A is: -4, 14, 32, 50, 68, 86";
		String expectedResB = "Linear sequence #B is: 41, 29, 17, 5, -7, -19, -31, -43";
		String obtainedResA = "Linear sequence #A is: " + listLinearSequenceA(6);
		String obtainedResB = "Linear sequence #B is: " + listLinearSequenceB(8);
		testGrpNum++;
		printGroupTitle();

		System.out.println("TEST RUN " + testGrpNum + ".1");
		System.out.println("Expected : " + expectedResA);
		System.out.println("Obtained : " + obtainedResA);
		if (expectedResA.equals(obtainedResA)) passed(); else failed();
		System.out.println();
		
		System.out.println("TEST RUN " + testGrpNum + ".2");
		System.out.println("Expected : " + expectedResB);
		System.out.println("Obtained : " + obtainedResB);
		if (expectedResB.equals(obtainedResB)) passed(); else failed();
		System.out.println();
	}
	
	public static void testListPowersOfThree() {
		String expectedRes = "The powers of 3 from 3^0 to 3^10 are 1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049";
		String obtainedRes = "The powers of 3 from 3^0 to 3^10 are " + listPowersOfThree(10);
		testGrpNum++;
		printGroupTitle();
		System.out.println("TEST RUN " + testGrpNum + ".1");
		System.out.println("Expected : " + expectedRes);
		System.out.println("Obtained : " + obtainedRes);
		if (expectedRes.equals(obtainedRes)) passed(); else failed();
		System.out.println();		
	}
	
	public static void testFibonacci() {
		String expectedRes = "The first 12 Fibonacci numbers are "
				+ "1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
		String obtainedRes = "The first 12 Fibonacci numbers are " + listFibonacciNumbers(12);	
		testGrpNum++;
		printGroupTitle();
		System.out.println("TEST RUN " + testGrpNum + ".1");
		System.out.println("Expected : " + expectedRes);
		System.out.println("Obtained : " + obtainedRes);
		if (expectedRes.equals(obtainedRes)) passed(); else failed();
		System.out.println();
	}
	
	public static void testPrimes() {
		String expectedRes = "Prime numbers less than 1000 are \n"
				+ "     2     3     5     7    11    13    17    19    23    29\n"
				+ "    31    37    41    43    47    53    59    61    67    71\n"
				+ "    73    79    83    89    97   101   103   107   109   113\n"
				+ "   127   131   137   139   149   151   157   163   167   173\n"
				+ "   179   181   191   193   197   199   211   223   227   229\n"
				+ "   233   239   241   251   257   263   269   271   277   281\n"
				+ "   283   293   307   311   313   317   331   337   347   349\n"
				+ "   353   359   367   373   379   383   389   397   401   409\n"
				+ "   419   421   431   433   439   443   449   457   461   463\n"
				+ "   467   479   487   491   499   503   509   521   523   541\n"
				+ "   547   557   563   569   571   577   587   593   599   601\n"
				+ "   607   613   617   619   631   641   643   647   653   659\n"
				+ "   661   673   677   683   691   701   709   719   727   733\n"
				+ "   739   743   751   757   761   769   773   787   797   809\n"
				+ "   811   821   823   827   829   839   853   857   859   863\n"
				+ "   877   881   883   887   907   911   919   929   937   941\n"
				+ "   947   953   967   971   977   983   991   997";
		String obtainedRes = "Prime numbers less than 1000 are \n" + listPrimes(1000);
		testGrpNum++;
		printGroupTitle();
		System.out.println("TEST RUN " + testGrpNum + ".1");
		System.out.println("Expected : " + expectedRes);
		System.out.println("Obtained : " + obtainedRes);
		if (expectedRes.equals(obtainedRes)) passed(); else failed();
		System.out.println();
	}
	
	public static void printGroupTitle() {
		System.out.println("++++++++++++++++++++");		
		System.out.printf("+++++ GROUP %2s +++++%n", testGrpNum);
		System.out.println("++++++++++++++++++++\n");
	}
	
	/* This method simply prints PASSED and increments numPassed*/
	public static void passed() {
		System.out.println("PASSED :-)");
		numPassed++;
	}
	
	/* This method simply prints FAILED */
	public static void failed() {
		System.out.println("FAILED :-(");
	}
	
	/**
	 * This main program runs a few simple algorithms and tests that the results match the expected result.
	 * @param args - array of Strings
	 */
	public static void main(String[] args) {

		testSumN1ToN2();
		testSumEvenNumbersN1ToN2();
		testSumSquaresOfNumbers();
		testListSquaresOfNumbers();
		testListLinearSequences();
		testListPowersOfThree();
		testFibonacci();
		testPrimes();
		
		System.out.println(numPassed + " out of " + total + " tests have passed!");
		
	}

}