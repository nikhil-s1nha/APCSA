package Labs.lab05;

import java.util.Arrays;

public class Lab05bBubbleSortArray {
	public static void printArray (int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	/** bubbleSort
	 * @param arr - pass in an array of int values using the bubble sort algorithm.
	 * @return - a new array of int values that is a sorted version of the array
	 * that is passed in as a parameter.
	 */
	/* WRITE THIS BY GOING THROUGH THE LOOP ALL THE WAY EACH TIME */
	public static int[] bubbleSort(int[] arr) {
		int[] arrSorted = new int[arr.length];
		System.arraycopy(arr, 0, arrSorted, 0, arr.length);
		int numIterations = 0;

		/* Write your sorting algorithm here.
		 * Increment the numIterations variable during each iteration.
		 */
        for (int j = 0; j < arrSorted.length; j++){
            for (int i = 0; i < arrSorted.length - 1; i++){
            numIterations++;

            if (arrSorted[i] > arrSorted[i+1]){
                int current = arrSorted[i];
                arrSorted[i] = arrSorted[i+1];
                arrSorted[i+1] = current;
            }
        }
        }
        

		
		System.out.println("Number of iterations = " + numIterations);
		return arrSorted;
	}

	/* test the sorting algorithm */
	public static boolean testSort(int testCaseNum, int[] arr, int[] expectedSortedArr) {
		int[] arrSorted;
		System.out.println("TEST CASE #" + testCaseNum);
		System.out.print("Original array: ");
		System.out.println(Arrays.toString(arr));
		arrSorted = bubbleSort(arr);
		System.out.print("Sorted array:   ");
		System.out.println(Arrays.toString(arrSorted));
		if (Arrays.equals(arrSorted, expectedSortedArr)) {System.out.println("PASSED!\n-----"); return true;}
		else {System.out.println("FAILED!\n-----"); return false;}
	}

	public static void main(String[] args) {
		
		int[] arr1 = {9, 10, 21, 32, 43, 54, 65, 76, 87, 98};
		int[] arr2 = {98, 87, 76, 65, 54, 43, 32, 21, 10, 9};
		int[] arr3 = {65, 9, 43, 98, 32, 10, 87, 54, 76, 21};
		int[] expectedSortedArr = {9, 10, 21, 32, 43, 54, 65, 76, 87, 98};
		
		int numTotal = 3;
		int numPassed = 0;

		System.out.println("===========");
		System.out.println("BUBBLE SORT");
		System.out.println("===========");
		if (testSort(1, arr1, expectedSortedArr)) numPassed++;
		if (testSort(2, arr2, expectedSortedArr)) numPassed++;
		if (testSort(3, arr3, expectedSortedArr)) numPassed++;

		System.out.println("Score passed/total = " + numPassed + "/" + numTotal);
	}
}