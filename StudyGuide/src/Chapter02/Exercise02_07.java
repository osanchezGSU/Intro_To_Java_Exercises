package Chapter02;
import java.util.Scanner;

/*(1 star)
 * (Find the number of years)
 * Write a program that prompts the user
 * to enter the minutes (e.g., 1 billion),
 * and displays the number of years 
 * and days for the minutes. 
 * For simplicity, assume a year has
 * 365 days.
 */

public class Exercise02_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		int minutesPerYear = 60 * 24 * 365;
		int mintuesPerDay = 60 * 24;
		int totalYears = minutes / minutesPerYear;
		int remainingYears = minutes % minutesPerYear / (mintuesPerDay);
		
		
		System.out.println(minutes+ " minutes is approximately " +totalYears+ " years and " +remainingYears+ " days");
		
		
	}

}
