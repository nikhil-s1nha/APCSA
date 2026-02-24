package Labs.lab04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
Write a program that finds the total and average of a list of numbers given as input
either through the console or through a file.
Use an alphabet as a sentinel.
*/

import java.util.Scanner;
public class Lab04bSentinelsNumbers {

	// Print the contents of the file
    public static void printFileContents(String filePath) {
        try {
            String content = Files.readString(Path.of(filePath));
            System.out.println(content);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // There are 5 sections of code to be written: A, B, C, D, and E.
    // Without deleting any of the comments, complete the sections of code as instructed.
	public static void printInputNumsAvg(String fileName) throws IOException {
				
		// Section A - SET UP THE SCANNER
		// Declare the Scanner object scan1
		// Write code to check if fileName is null; if it is,
		//   print "Reading input from console"
		//   print "Enter numbers to be added up; end with any non-numeric string of characters to end the sequence:");
		//   initialize scan1 to read from the console
		// otherwise
		//   print "Reading input from " and append the fileName
		//   call printFileContents to print the contents of the file
		//   declare and initialize a File object using the given fileName
		//   Declare and initialize the scan1 object to read from this file.
		// Write your code below these comments

		
		// Section B: ACCUMULATE TOTAL and TRACK COUNT OF NUMBERS
		// Declare and initialize total and count to keep track to accumulate the
		// sum of the numbers and to track the number of numbers being accumulated.
		// Set up a while loop to accumulate the total and to count the number of numbers.
		// Use the hasNextInt() and nextInt() methods.
		// Write your code for this section below this:

		
		// Section C: PRINT THE TOTAL
		// Print the total with a prefix "Total = " and append the total.
		// Write your 1-line code below this.

		
		// Section D: CALCULATE AND PRINT THE AVERAGE
		// Declare and initialize the average variable.
		// Calculate the average
		// Print the average with the prefix "Average = " and append the average.
		// Note: take care of the special case when count is 0
		// Write your code-snippet below this.

		
		// Section E: CLOSE THE SCANNER OBJECT
		// Close scan1
		// Write your 1-line code below this.

		
		System.out.println("=========================");

	}
	
	// The main program tests input from the console and input from files.
	public static void main(String[] args) throws IOException {
		System.out.print("Do you want to test using the Console or File? [C | F ]: ");
		Scanner scan = new Scanner(System.in);
		String input = "";
		while (!input.equals("C") && !input.equals("F") && scan.hasNext()) {
			input = scan.next().toUpperCase();
		}
		if (input.equals("C")) {
			printInputNumsAvg(null);			
		}
		else {
			String path = "src/lab04/";
			printInputNumsAvg(path+"nums1.txt");
			printInputNumsAvg(path+"nums2.txt");
			printInputNumsAvg(path+"nums3.txt");
			printInputNumsAvg(path+"nums4.txt");
			printInputNumsAvg(path+"nums5.txt");
			printInputNumsAvg(path+"nums6.txt");
			printInputNumsAvg(path+"nums7.txt");
			printInputNumsAvg(path+"nums8.txt");
			printInputNumsAvg(path+"nums9.txt");
			printInputNumsAvg(path+"numsa.txt");	
		}
	}
}
