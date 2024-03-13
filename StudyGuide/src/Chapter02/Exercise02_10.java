package Chapter02;
import java.util.Scanner;

/*
 * (Science: calculating energy)
 * Write a program that calculates the energy 
 * needed to heat water from an initial temperature 
 * to a final temperature. Your program should prompt 
 * the user to enter the amount of water in kilograms 
 * and the initial and final temperatures of the water. 
 * The formula to compute the energy is:
 * Q = M * (finalTemperature – initialTemperature) * 4184
 * where M is the weight of water in kilograms, 
 * temperatures are in degrees Celsius, and energy Q is 
 * measured in joules.
 */

public class Exercise02_10 {

	public static void main(String[] args) {
		double amountOfWater, initialTemp, finalTemp;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the amount of water in kilograms: ");
		amountOfWater = input.nextDouble();
		System.out.println("Enter the initial temperature: ");
		initialTemp = input.nextDouble();
		System.out.println("Enter the final temperature: ");
		finalTemp = input.nextDouble();
		
		
		double energy = amountOfWater * (finalTemp - initialTemp) * 4184;
		
		
		
		System.out.print("The energy needed is " +energy);
		
	}

}
