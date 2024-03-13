package Chapter02;
import java.util.Scanner;

/* (1 star)
 * (Financial application: monetary units)
 *  Rewrite Listing 2.10, ComputeChange .java, 
 *  to fix the possible loss of accuracy when converting 
 *  a double value to an int value. Enter the input as an 
 *  integer whose last two digits represent the cents. 
 *  For example, the input 1156 represents 11 dollars and 
 *  56 cents.
 */

public class Exercise02_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an amount in integer, for example 1156: ");
		int amount = input.nextInt();
		int dollars = amount / 100;
		amount = amount % 100;
		
		int tens = amount / 10;
		amount = amount % 10;
		
		System.out.print("$" + dollars+ "."+ tens+ ""+amount);
		
	}

}
