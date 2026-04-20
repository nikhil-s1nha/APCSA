package Labs.lab07;

import java.util.ArrayList;
import java.util.Arrays;
public class Lab07bArrayListAlgorithmsOptional {
	
	
	/**
	 * Goes through the given ArrayList arrL and returns true if the list has any duplicate elements.
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 * @return - true if the list arrL has duplicate values; false, otherwise.
	 */
	public static boolean hasDuplicates (ArrayList<Integer> arrL) {
		
		/* INSERT YOUR CODE BELOW THESE COMMENTS, REPLACING THE LAST LINE IF NECESSARY
		 */
		return false;
	}

	/**
	 * Modifies the given ArrayList by rotating all the elements to the right.
	 * Must implement without creating a new ArrayList.
	 * For this implementation, use a FOR LOOP.
	 * The last element becomes the first element; all other elements are shifted to the right.
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 */
	public static void rotateRight1 (ArrayList<Integer> arrL) {
		/* INSERT YOUR CODE BELOW THESE COMMENTS
		 */

	}
	

	/**
	 * Modifies the given ArrayList by rotating all the elements to the right.
	 * Must implement without creating a new ArrayList.
	 * DO THIS IMPLEMENTATION WITHOUT A FOR LOOP
	 * The last element becomes the first element; all other elements are shifted to the right.
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 */
	public static void rotateRight2 (ArrayList<Integer> arrL) {
		/* INSERT YOUR CODE BELOW THESE COMMENTS
		 */

	}

	/**
	 * Modifies the given ArrayList by reversing the order of all the elements in the list
	 * Must implement without creating a new ArrayList.
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 */
	public static void reverse (ArrayList<Integer> arrL) {
		/* INSERT YOUR CODE BELOW THESE COMMENTS
		 */

	}

	/**************************************************************/
	/*        DO NOT EDIT BELOW THESE LINES                       */
	/**************************************************************/
	
	/* test hasDuplicates */
	public static void testDuplicates() {
		System.out.println("TESTING hasDuplicates");
		System.out.println("=====================");

		ArrayList<Integer> arrL1 = new ArrayList<>(Arrays.asList(1, 4, 5, 16, 26));
		
		boolean duplicatesExist = false;
		
		System.out.print(arrL1 + " <-- ");
		duplicatesExist = hasDuplicates(arrL1);
		System.out.println("This ArrayList has duplicates: " + duplicatesExist + "; " + (duplicatesExist? "FAILED" : "PASSED!"));
		
		arrL1.set(2, 4); System.out.print(arrL1 + " <-- ");
		duplicatesExist = hasDuplicates(arrL1);
		System.out.println("This ArrayList has duplicates: " + duplicatesExist + "; " + (duplicatesExist? "PASSED!" : "FAILED!"));
		
		arrL1.set(1, 1); System.out.print(arrL1 + " <-- ");
		duplicatesExist = hasDuplicates(arrL1);
		System.out.println("This ArrayList has duplicates: " + duplicatesExist + "; " + (duplicatesExist? "PASSED!" : "FAILED!"));
		
		arrL1.set(1, 2); arrL1.set(4,16); System.out.print(arrL1 + " <-- ");
		duplicatesExist = hasDuplicates(arrL1);

		System.out.println("This ArrayList has duplicates: " + duplicatesExist + "; " + (duplicatesExist? "PASSED!" : "FAILED!"));
		System.out.println();
		
	}
	
	/* test rotateRight */
	public static void testRotateRight1() {
		System.out.println("TESTING rotateRight1");
		System.out.println("====================");
		ArrayList<Integer> arrL1 =
				new ArrayList<>(Arrays.asList(5, 9, 3, 8, 2, 0, 7, 4, 6, 1));
		System.out.println("Original:      "+arrL1);
		rotateRight1(arrL1);
		ArrayList<Integer> expectedArrL1 = new ArrayList<>(Arrays.asList(1, 5, 9, 3, 8, 2, 0, 7, 4, 6));
		System.out.println("Rotated right: "+arrL1 + "; " + 
				(arrL1.equals(expectedArrL1) ? "PASSED!" : "FAILED!"));
		System.out.println();
	}
	
	/* test rotateRight */
	public static void testRotateRight2() {
		System.out.println("TESTING rotateRight2");
		System.out.println("====================");
		ArrayList<Integer> arrL1 =
				new ArrayList<>(Arrays.asList(5, 9, 3, 8, 2, 0, 7, 4, 6, 1));
		System.out.println("Original:      "+arrL1);
		rotateRight2(arrL1);
		ArrayList<Integer> expectedArrL1 = new ArrayList<>(Arrays.asList(1, 5, 9, 3, 8, 2, 0, 7, 4, 6));
		System.out.println("Rotated right: "+arrL1 + "; " + 
				(arrL1.equals(expectedArrL1) ? "PASSED!" : "FAILED!"));
		System.out.println();
	}
	
	/* test reverse */
	public static void testReverse() {
		System.out.println("TESTING reverse");
		System.out.println("===============");
		ArrayList<Integer> arrL1 =
				new ArrayList<>(Arrays.asList(38, 65, 10, 29, 101, 47, 92, 56, 74, 83));
		System.out.println("Original:   "+arrL1);
		reverse(arrL1);
		ArrayList<Integer> expectedArrL2 = new ArrayList<>(Arrays.asList(83, 74, 56, 92, 47, 101, 29, 10, 65, 38));
		System.out.println("Reversed:   "+arrL1 + "; " + 
				(arrL1.equals(expectedArrL2) ? "PASSED!" : "FAILED!"));
		System.out.println();
	}

	/* Test all the methods */
	public static void main(String[] args) {
		/* You can work on these one at a time by commenting and uncommenting the lines below */
		testDuplicates();
		testRotateRight1();
		testRotateRight2();
		testReverse();
	}

}