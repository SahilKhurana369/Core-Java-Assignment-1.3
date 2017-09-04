/**
 * 
 */
package Assignment_1;

/**
 * Write a program in java to compare the truth table of Bitwise AND and Logical AND.  
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 *
 */

import java.util.Scanner;																// This will import the Scanner class.
import java.util.regex.*;
public class Assignment_1_3 {

	/**
	 * @param args
	 */
		public static void main(String[] args) {											// Main methods Starts.			
	        int binaryNum1;																	// Declaring a Integers(Variable) named binatyNum1.
	        Scanner sc1 = new Scanner(System.in);											// Initialize the scanner to get input from User.
	        System.out.print("Enter a First Binary Number: ");								// This will print out the argument and ends the line.
	        binaryNum1 = sc1.nextInt();														// Read input of a as integer binaryNum1 from the User.
	    	String str1 = Integer.toString(binaryNum1);										// convert Integer to string.
	        Pattern p1 = Pattern.compile("[01]+");											// The Pattern class represents a compiled regular expression.
	        Matcher m1 = p1.matcher(str1);													// The resulting Pattern object is used to obtain a Matcher instance.
	        boolean b1 = m1.find();															// Declaring a boolean(Variable) named b1 and find  the Matcher instance.
	        if (b1 == true);																// if and else loop ..to check input binaryNum1 from the User is 0 or 1.
																							// can added to check the out ..{ System.out.println("First Binary Number is Correct " + binaryNum1); }
	        else {
	            System.out.println("Try again by entering binary number 0 or 1 ");			// if the binaryNum1 from the User is not 0 or 1 then it will print "Try again by entering binary number 0 or 1" 
	            System.exit(0);																// System.exit(0) will terminate the JVM and so your program.
	        }


	        boolean firstBinaryNumber;														// Declaring a boolean(Variable) named firstBinaryNumber.		
	        if ((binaryNum1 > 0)) firstBinaryNumber = true;									// if and else loop ..to check convert integer binaryNum1 to boolean firstBinaryNumber.
	        else {
	            firstBinaryNumber = false;
	        }

		
			int binaryNum2;																	// Declaring a Integers(Variable) named binatyNum1.
	        Scanner sc2 = new Scanner(System.in);											// Initialize the scanner to get input from User.
			System.out.print("Enter a Second Binary Number: ");								// This will print out the argument and ends the line.
	        binaryNum2 = sc2.nextInt();														// Read input of a as integer binaryNum2 from the User.
	    	String str2 = Integer.toString(binaryNum1);										// convert Integer to string.
	        Pattern p2 = Pattern.compile("[01]+");											// The Pattern class represents a compiled regular expression.
	        Matcher m2 = p2.matcher(str2);													// The resulting Pattern object is used to obtain a Matcher instance.
	        boolean b2 = m2.find();															// Declaring a boolean(Variable) named b2 and find  the Matcher instance.
	        if (b1 == true);																// if and else loop ..to check input binaryNum2 from the User is 0 or 1.
																							// can added to check the out ..{ System.out.println("Second Binary Number is Correct " + binaryNum2); }
	        else {
	            System.out.println("Try again by entering binary number 0 or 1 ");			// if the binaryNum1 from the User is not 0 or 1 then it will print "Try again by entering binary number 0 or 1" 
	            System.exit(0);																// System.exit(0) will terminate the JVM and so your program.
	        }

	        boolean secondBinaryNumber;														// Declaring a boolean(Variable) named firstBinaryNumber.		
	        if ((binaryNum2 > 0)) secondBinaryNumber = true;								// if and else loop ..to check convert integer binaryNum2 to boolean secondBinaryNumber.
	        else {
	            secondBinaryNumber = false;
	        }
			
	        System.out.println();																
	        System.out.println( "      Truth Table of Logical AND and Bitwise AND       ");		// Print the truth table of Bitwise AND and Logical AND
	        System.out.println( "=======================================================");		 
	        System.out.println( "       P        q    Logical AND    Bitwise AND       " );		
	        System.out.println( "=======================================================");
	        System.out.printf(  "%8d %8d %11s %11d\n", binaryNum1, binaryNum2, firstBinaryNumber && secondBinaryNumber, binaryNum1 & binaryNum2 );
	        System.out.println( "=======================================================");
	    }																						// Main methods Closed
	}																							//Class Assignment1_3 closed
