package Labs.lab08;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab08bInsertionSortArrayList {
	
	/**
	 * Modifies the given ArrayList by sorting the array using insertionSort
	 * Must implement without creating a new ArrayList.
	 * This version does swaps similar to the algorithm for arrays.
	 * 
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 */
	public static void insertionSort1 (ArrayList<Integer> arrL) {
        int numIterations = 0;
        
        /* Insert your code below this comment.
         * This version must use get and set to do a swap similar to arrays.
         * This version must NOT use add or remove.
         */

        
        // Print the total number of iterations
	    System.out.println("Number of iterations: " + numIterations);
	}

	/**
	 * Modifies the given ArrayList by sorting the array using insertionSort
	 * Must implement without creating a new ArrayList.
	 * This version takes advantage of the ArrayList features.
	 * It must use get, add, and remove, but not set.
	 * @param arrL - an ArrayList of integer values
	 *                Precondition - arrL is not null
	 */
	public static void insertionSort2 (ArrayList<Integer> arrL) {
        int numIterations = 0;
        
        /* Insert your code below this comment.
         * This version must use get, add, and remove.
         * This version must NOT use set.
         */

	    	    
        // Print the total number of iterations
	    System.out.println("Number of iterations: " + numIterations);
	}

	/**************************************************************
	 *************** MAIN PROGRAM TO DO THE TESTING ***************
	 **************************************************************/
	

	public static void main(String[] args) {

		/* test insertion sort */

		ArrayList<Integer> arrL1;
		ArrayList<Integer> expectedSortedArrL1 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

		System.out.println("TESTING insertionSort1");
		System.out.println("======================");
		
		arrL1 = new ArrayList<>(Arrays.asList(5, 9, 3, 8, 2, 0, 7, 4, 6, 1));

		System.out.println("Original: "+arrL1);
		insertionSort1(arrL1);
		System.out.println("Sorted:   "+arrL1 + "; " + 
				(arrL1.equals(expectedSortedArrL1) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		
		arrL1 = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
		System.out.println("Original: "+arrL1);
		insertionSort1(arrL1);
		System.out.println("Sorted:   "+arrL1 + "; " + 
				(arrL1.equals(expectedSortedArrL1) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		
		arrL1 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println("Original: "+arrL1);
		insertionSort1(arrL1);
		System.out.println("Sorted:   "+arrL1 + "; " + 
				(arrL1.equals(expectedSortedArrL1) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		System.out.println();


		System.out.println("TESTING insertionSort2");
		System.out.println("======================");
		
		arrL1 = new ArrayList<>(Arrays.asList(5, 9, 3, 8, 2, 0, 7, 4, 6, 1));

		System.out.println("Original: "+arrL1);
		insertionSort2(arrL1);
		System.out.println("Sorted:   "+arrL1 + "; " + 
				(arrL1.equals(expectedSortedArrL1) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		
		arrL1 = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
		System.out.println("Original: "+arrL1);
		insertionSort2(arrL1);
		System.out.println("Sorted:   "+arrL1 + "; " + 
				(arrL1.equals(expectedSortedArrL1) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		
		arrL1 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println("Original: "+arrL1);
		insertionSort2(arrL1);
		System.out.println("Sorted:   "+arrL1 + "; " + 
				(arrL1.equals(expectedSortedArrL1) ? "PASSED!" : "FAILED!"));
		System.out.println("---------");
		System.out.println();

	}

	

}
