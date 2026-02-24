package Labs.lab04;

/*
Write a program that determines and prints the number of words in a paragraph
using input from the console. Use the word "0" (separated from other words by
whitespace) as a sentinel to determine the end of paragraph, along with their
corresponding expected results. All of these cases must work as expected.

Complete SECTION A below.
*/

import java.util.Scanner;
public class Lab04aSentinelsParagraph {

	public static void main(String[] args) {
		Scanner inScan = new Scanner(System.in);		
		int count = 0;
		System.out.println("Enter your paragraph; enter 0 to end the paragraph:");
		
		// SECTION A:
		// Read input from the console, use the variable count to keep track of the number of words.
		// Use the hasNext() and next() methods. Use the string "0" to end the paragraph.
		// Enter your code below this line

        Scanner reader = new Scanner(System.in);
        while(reader.hasNext()){
            String word = reader.next();
            if(word.equals("0")){
                break;
            }
            count++;
        }
		
		System.out.println("Total # of words = " + count);
		inScan.close();
	}
}
/*

TEST CASE #1 - Empty paragraph
++++++++++++
Enter your paragraph; enter 0 to end the paragraph:
0
Total # of words = 0

TEST CASE #2 - Paragraph w/o new lines
++++++++++++
Enter your paragraph; enter 0 to end the paragraph:
Once upon a time there were three little bears. 0
Total # of words = 9

TEST CASE #3 - Paragraph w/ new lines
++++++++++++
Enter your paragraph; enter 0 to end the paragraph:
Once upon a time there were
three little bears. They lived
happily ever after. 0
Total # of words = 14

TEST CASE #4 - Paragraph w/ new lines, but with text after the sentinel.
++++++++++++
Enter your paragraph; enter 0 to end the paragraph:
Once upon a time there were
three little bears. They lived
happily ever after. 0 However, Goldilocks messed up their lives!
Total # of words = 14

*/