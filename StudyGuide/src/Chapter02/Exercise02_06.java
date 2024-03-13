package Chapter02;
import java.util.Scanner;

/* (2 star)
 *(Sum the digits in an integer)
 * Write a program that reads an integer
 * between 0 and 1000 and adds all the
 * digits in the integer. 
 * For example, if an integer is 932,
 * the sum of all its digits is 14.
 */

public class Exercise02_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number between 0 an 1000: ");
		int digit = input.nextInt();
		int num1 = digit % 10;
		digit /= 10;
		int num2 = digit % 10;
		int num3 = digit / 10;
		
		int sum = num1 + num2 + num3;
		System.out.print("The sum of the digits is " +sum);
		
	}

}
