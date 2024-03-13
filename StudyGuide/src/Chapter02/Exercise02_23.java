package Chapter02;
import java.util.Scanner;

/* (1 star)
 * (Cost of driving) 
 * Write a program that prompts the user to enter the 
 * distance to drive, the fuel efficiency of the car in 
 * miles per gallon, and the price per gallon, and displays 
 * the cost of the trip
 */

public class Exercise02_23 {

	public static void main(String[] args) {
		double mpg, ppg, distance, cost;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the driving distance: ");
		distance = input.nextDouble();
;		System.out.print("Enter miles per gallon: ");
		mpg = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		ppg = input.nextDouble();
		
		cost = (distance / mpg) * ppg;
		System.out.print("The cost of driving is $" +cost);
	}

}
