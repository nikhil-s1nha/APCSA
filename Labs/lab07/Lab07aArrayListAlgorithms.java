package Labs.lab07;

import java.util.ArrayList;
import java.util.Arrays;
public class Lab07aArrayListAlgorithms {

	/**
	 * Determines if the input parameter number is a perfect square
	 * @param number
	 * 		Precondition: number >= 1;
	 * @return - true if number is a perfect square, otherwise false
	 */
	public static boolean IsPerfectSquare (int number) {
		
		/* INSERT YOUR CODE BELOW THESE COMMENTS, REPLACING THE LAST STATEMENT BELOW
		*/

		return false;
	}

	/**
	 * Searches the elements of given ArrayList arrL using the linear search approach and returns
	 * the index value of the element whose value matches a given integer value findInt.
	 * @param arrL - an ArrayList of integer values
	 *               Precondition - arrL is not null
	 * @param findInt - an integer value to be searched for in arrL
	 * @return - the index value of findInt in arrL; -1, if not found.
	 */
	public static int search (ArrayList<Integer> arrL, int findInt) {
		
		/* INSERT YOUR CODE BELOW THESE COMMENTS
		*/

		return -1;
	};
	
	/**
	 * Searches the elements of given ArrayList arrL using the linear search approach for
	 * an element whose value matches a given integer value findInt.
	 * If found, removes the element and returns true.
	 * If not found, returns false.
	 * @param arrL - an ArrayList of integer values
	 *               Precondition - arrL is not null
	 * @param findInt - an integer value to be searched for in arrL
	 * @return - the index value of findInt in arrL; -1, if not found.
	 */
	public static boolean searchRemove (ArrayList<Integer> arrL, int findInt) {
		/* INSERT YOUR CODE BELOW THESE COMMENTS, REMOVING THE LAST LINE IF NECESSARY
		*/

		return false;
	}

	/**
	 * Goes through the given ArrayList arrL and returns true if at least one elements in the given
	 * ArrayList arrL is a perfect square.
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 * @return - true if the list arrL has at least one perfect square; false, otherwise.
	 */
	public static boolean hasAtLeastOnePerfectSquare(ArrayList<Integer> arrL) {
		
		/* INSERT YOUR CODE BELOW THESE COMMENTS, REMOVING THE LAST LINE IF NECESSARY
		*/

		return false;
	}
	
	/**
	 * Goes through the given ArrayList arrL and returns true if all the elements in the given
	 * ArrayList arrL are perfect squares.
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 * @return - true if the list arrL is a list of perfect squares; false, otherwise.
	 */
	public static boolean hasAllPerfectSquares (ArrayList<Integer> arrL) {
		
		/* INSERT YOUR CODE BELOW THESE COMMENTS, REMOVING THE LAST LINE IF NECESSARY
		*/

		return false;
	}
	
	/**
	 * Goes through the given ArrayList arrL and returns the number of perfect squares in the given
	 * ArrayList arrL are perfect squares.
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 * @return - an int value showing the number of perfect squares in the given list arrL
	 */
	public static int numberOfPerfectSquares(ArrayList<Integer> arrL) {
		
		int count = 0;

		/* INSERT YOUR CODE BELOW THESE COMMENTS
		*/

		
		return count;
	}
	
	/***************************************************************/
	/*                DO NOT EDIT BELOW THESE LINES                */
	/***************************************************************/
	

	public static void testSearch() {
		ArrayList<Integer> arrL = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println("==============");
		System.out.println("TESTING search");
		System.out.println("==============");
		System.out.println("ArrayList to be searched: "+ arrL);
		int[] searchTargets = {10, 20, 30, 40, 50, 60};
		int[] expectedIndexes = {0, 1, 2, 3, 4, -1};
		for (int i = 1; i < searchTargets.length; i++) {
			int targetIndex = search(arrL, searchTargets[i]);
			System.out.print("Looking for element with value " + searchTargets[i] + ". ");
			System.out.print((targetIndex==-1 ?
					"Did not find element. " :
					"Found element at index " + targetIndex + ". "));
			System.out.println((targetIndex==expectedIndexes[i] ? "PASSED!" : "FAILED!"));
		}
		System.out.println();
	}
	
	public static void testSearchRemove() {
		ArrayList<Integer> arrL = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

		System.out.println("====================");
		System.out.println("TESTING searchRemove");
		System.out.println("====================");
		System.out.println("ArrayList to be searched: "+ arrL);
		int[] searchTargets = {10, 20, 30, 40, 50, 60};
		boolean[] expectedRemoved = {true, true, true, true, true, false};
		for (int i = 1; i < searchTargets.length; i++) {
			ArrayList<Integer> arrL1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
			boolean removed = searchRemove(arrL1, searchTargets[i]);
			System.out.print("Looking for element with value " + searchTargets[i] + ". ");
			System.out.print((removed ? "Found element and removed it. " : "Did not find element. "));
			boolean passed1 = removed==expectedRemoved[i];
			boolean passed2 = false;
			switch (searchTargets[i]) {
				case 10: passed2 = arrL1.equals(new ArrayList<>(Arrays.asList(20, 30, 40, 50))); break;
				case 20: passed2 = arrL1.equals(new ArrayList<>(Arrays.asList(10, 30, 40, 50))); break;
				case 30: passed2 = arrL1.equals(new ArrayList<>(Arrays.asList(10, 20, 40, 50))); break;
				case 40: passed2 = arrL1.equals(new ArrayList<>(Arrays.asList(10, 20, 30, 50))); break;
				case 50: passed2 = arrL1.equals(new ArrayList<>(Arrays.asList(10, 20, 30, 40))); break;
				case 60: passed2 = arrL1.equals(arrL); break;
				default: passed2 = arrL1.equals(arrL);
			}
			boolean passed = passed1 & passed2;
			System.out.println(passed ? "PASSED!" : "FAILED!");
		}
		System.out.println();
	}
	
	/* test hasAtLeastOnePerfectSquare */
	public static void testHasAtLeastOnePerfectSquare() {
		System.out.println("==================================");
		System.out.println("TESTING hasAtLeastOnePerfectSquare");
		System.out.println("==================================");
		ArrayList<Integer> arrL;
		boolean hasAtLeastOnePerfectSquare = false;
		
		arrL = new ArrayList<>(Arrays.asList(1, 41, 91, 161, 261));
		System.out.print(arrL + " <-- ");
		hasAtLeastOnePerfectSquare = hasAtLeastOnePerfectSquare(arrL);
		System.out.println("This ArrayList has at least one perfect square: " + hasAtLeastOnePerfectSquare + "; "
				+ (hasAtLeastOnePerfectSquare==true ? "PASSED!" : "FAILED"));

		arrL.set(0,11);
		System.out.print(arrL + " <-- ");
		hasAtLeastOnePerfectSquare = hasAtLeastOnePerfectSquare(arrL);
		System.out.println("This ArrayList has at least one perfect square: " + hasAtLeastOnePerfectSquare + "; "
				+ (hasAtLeastOnePerfectSquare==false ? "PASSED!" : "FAILED"));
		
		arrL.set(1,49); arrL.set(3,169);
		System.out.print(arrL + " <-- ");
		hasAtLeastOnePerfectSquare = hasAtLeastOnePerfectSquare(arrL);
		System.out.println("This ArrayList has at least one perfect square: " + hasAtLeastOnePerfectSquare + "; "
				+ (hasAtLeastOnePerfectSquare==true ? "PASSED!" : "FAILED"));

		arrL.set(1,41); arrL.set(3, 161); arrL.set(4, 256);
		System.out.print(arrL + " <-- ");
		hasAtLeastOnePerfectSquare = hasAtLeastOnePerfectSquare(arrL);
		System.out.println("This ArrayList has at least one perfect square: " + hasAtLeastOnePerfectSquare + "; "
				+ (hasAtLeastOnePerfectSquare==true ? "PASSED!" : "FAILED"));

		arrL.set(4, 257);
		System.out.print(arrL + " <-- ");
		hasAtLeastOnePerfectSquare = hasAtLeastOnePerfectSquare(arrL);
		System.out.println("This ArrayList has at least one perfect square: " + hasAtLeastOnePerfectSquare + "; "
				+ (hasAtLeastOnePerfectSquare==false ? "PASSED!" : "FAILED"));

		System.out.println();
	}

	/* test hasAllPerfectSquares */
	public static void testHasAllPerfectSquares () {
		System.out.println("============================");
		System.out.println("TESTING hasAllPerfectSquares");
		System.out.println("============================");
		ArrayList<Integer> arrL1;

		boolean hasOnlyPerfectSquares = false;
		arrL1 = new ArrayList<>(Arrays.asList(1, 4, 9, 16, 26));
		System.out.print(arrL1 + " <-- ");
		hasOnlyPerfectSquares = hasAllPerfectSquares(arrL1);
		System.out.println("This ArrayList is a list of perfect squares: " + hasOnlyPerfectSquares + "; "
				+ (hasOnlyPerfectSquares==false ? "PASSED!" : "FAILED"));
		arrL1.set(4,25);
		System.out.print(arrL1 + " <-- ");
		hasOnlyPerfectSquares = hasAllPerfectSquares(arrL1);
		System.out.println("This ArrayList is a list of perfect squares: " + hasOnlyPerfectSquares + "; "
				+ (hasOnlyPerfectSquares==true ? "PASSED!" : "FAILED"));
		arrL1.add(625); arrL1.add(169); arrL1.add(1000000); arrL1.add(4096);
		System.out.print(arrL1 + " <-- ");
		hasOnlyPerfectSquares = hasAllPerfectSquares(arrL1);
		System.out.println("This ArrayList is a list of perfect squares: " + hasOnlyPerfectSquares + "; "
				+ (hasOnlyPerfectSquares==true ? "PASSED!" : "FAILED"));
		arrL1.add(2048);
		System.out.print(arrL1 + " <-- ");
		hasOnlyPerfectSquares = hasAllPerfectSquares(arrL1);
		System.out.println("This ArrayList is a list of perfect squares: " + hasOnlyPerfectSquares + "; "
				+ (hasOnlyPerfectSquares==false ? "PASSED!" : "FAILED"));
		arrL1.remove(9);
		arrL1.add(1024);
		System.out.print(arrL1 + " <-- ");
		hasOnlyPerfectSquares = hasAllPerfectSquares(arrL1);
		System.out.println("This ArrayList is a list of perfect squares: " + hasOnlyPerfectSquares + "; "
				+ (hasOnlyPerfectSquares==true ? "PASSED!" : "FAILED"));
		System.out.println();
		
	}

	/* test hasAtLeastOnePerfectSquare */
	public static void testNumberOfPerfectSquares() {
		System.out.println("==============================");
		System.out.println("TESTING numberOfPerfectSquares");
		System.out.println("==============================");
		ArrayList<Integer> arrL;
		int numPerfectSquares = 0;
		
		arrL = new ArrayList<>(Arrays.asList(16, 48, 99, 161, 257));
		System.out.print(arrL + " <-- ");
		numPerfectSquares = numberOfPerfectSquares(arrL);
		System.out.println("This ArrayList has at least one perfect square: " + numPerfectSquares + "; "
				+ (numPerfectSquares==1 ? "PASSED!" : "FAILED"));

		arrL.set(0,15);
		System.out.print(arrL + " <-- ");
		numPerfectSquares = numberOfPerfectSquares(arrL);
		System.out.println("This ArrayList has at least one perfect square: " + numPerfectSquares + "; "
				+ (numPerfectSquares==0 ? "PASSED!" : "FAILED"));
		
		arrL.set(1,49); arrL.set(3,169);
		System.out.print(arrL + " <-- ");
		numPerfectSquares = numberOfPerfectSquares(arrL);
		System.out.println("This ArrayList has at least one perfect square: " + numPerfectSquares + "; "
				+ (numPerfectSquares==2 ? "PASSED!" : "FAILED"));

		arrL.set(0, 16); arrL.set(2, 100);
		arrL.set(4, 256);
		System.out.print(arrL + " <-- ");
		numPerfectSquares = numberOfPerfectSquares(arrL);
		System.out.println("This ArrayList has at least one perfect square: " + numPerfectSquares + "; "
				+ (numPerfectSquares==5 ? "PASSED!" : "FAILED"));

		arrL.set(4, 257);
		System.out.print(arrL + " <-- ");
		numPerfectSquares = numberOfPerfectSquares(arrL);
		System.out.println("This ArrayList has at least one perfect square: " + numPerfectSquares + "; "
				+ (numPerfectSquares==4 ? "PASSED!" : "FAILED"));

		System.out.println();
	}


	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrL1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		
		/* test search */
		
		testSearch();
		testSearchRemove();
		testHasAtLeastOnePerfectSquare();
		testHasAllPerfectSquares();
		testNumberOfPerfectSquares();
	
	}

}