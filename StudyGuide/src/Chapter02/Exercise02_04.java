package Chapter02;
import java.util.Scanner;

/*
 * (Convert pounds into kilograms)
 * Write a program that converts pounds into 
 * kilo-grams. The program prompts the user 
 * to enter a number in pounds, converts it to 
 * kilograms, and displays the result. 
 * One pound is 0.454 kilograms. 
 */

public class Exercise02_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number in pounds: ");
		double pound = input.nextDouble();
		
		double kilo = pound * 0.454;
		System.out.println(pound+ " pounds is " +kilo+ " kilograms");

	}

}
