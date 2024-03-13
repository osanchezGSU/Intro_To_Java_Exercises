package Chapter02;
import java.util.Scanner;

/*
 * (Physics: acceleration) 
 * Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, 
 * as shown in the following formula:
 * a = (v1 - v0) / t
 * Write a program that prompts the user 
 * to enter the starting velocity v0 in meters/ second, 
 * the ending velocity v1 in meters/second, 
 * and the time span t in seconds, and displays
 * the average acceleration.
 */

public class Exercise02_09 {

	public static void main(String[] args) {
		double startingVelo, endingVelo, time;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter v0, v1, and t: ");
		startingVelo = input.nextDouble();
		endingVelo = input.nextDouble();
		time = input.nextDouble();
		
		double averageAcceleration = (endingVelo - startingVelo) / time;
		System.out.print("The average acceleration is " +averageAcceleration);
		;
	}

}
