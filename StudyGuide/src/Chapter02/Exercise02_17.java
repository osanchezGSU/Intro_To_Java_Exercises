package Chapter02;
import java.util.Scanner;
import java.math.*;

/* (1 star)
 * (Science: wind-chill temperature) 
 * How cold is it outside? The temperature alone is not 
 * enough to provide the answer. Other factors including 
 * wind speed, relative humidity, and sunshine play 
 * important roles in determining coldness outside. In 2001, 
 * the National Weather Service (NWS) implemented the new 
 * wind-chill temperature to measure the coldness using 
 * temperature and wind speed. The formula is:
 * t(wc) = 35.74 + 0.6215t(a) - 35.75v^0.16 + 0.4275t(a)v^0.16
 * where ta is the outside temperature measured in degrees 
 * Fahrenheit and v is the speed measured in miles per hour. 
 * twc is the wind-chill temperature. The formula cannot be 
 * used for wind speeds below 2 mph or temperatures below 
 * -58F or above 41F. 
 * Write a program that prompts the user to enter a 
 * temperature between - 58F and 41F and a wind speed 
 * greater than or equal to 2 and displays the wind-chill
 * temperature. Use Math.pow(a, b) to compute v0.16. 
 */

public class Exercise02_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between - 58"
				+ "F and 41F: ");
		double ta = input.nextDouble();
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double v = input.nextDouble();
		
		double twc = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16)); 
		
		System.out.print("The wind chill index is " +twc);

	}

}
