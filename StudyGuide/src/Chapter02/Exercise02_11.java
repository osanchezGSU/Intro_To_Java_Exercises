package Chapter02;
import java.util.Scanner;

/*
 * (Population projection) 
 * Rewrite Programming Exercise 1.11
 * to prompt the user to enter the 
 * number of years and displays the 
 * population after the number of 
 * years. Use the hint in Programming
 * Exercise 1.11 for this program. 
 * The population should be cast into
 * an integer. Here is a sample run of 
 * the program:
 */

public class Exercise02_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number of years: ");
		int numberOfYears = input.nextInt();
		
		int secondsPerYear = 60 * 60 * 24 * 365;
		int birthsPerYear = secondsPerYear / 7;
		int deathsPerYear = secondsPerYear / 13;
		int immigrantsPerYear = secondsPerYear / 45;
		int currentPopulation = 312_032_486;
	
		for (int i = 1; i <= numberOfYears; i++) {
			
			int afterOneYear = currentPopulation + birthsPerYear + immigrantsPerYear - deathsPerYear;

			currentPopulation = afterOneYear;
			if (i == numberOfYears) {
			System.out.print("The population in " +i+ " years is "+currentPopulation);
			}
			
		}
		
	}

}
