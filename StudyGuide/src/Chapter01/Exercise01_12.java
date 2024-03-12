package Chapter01;

/*
 * (Average speed in kilometers)
 *  Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. 
 *  Write a program that displays the average speed in kilometers per hour. 
 *  (Note that 1 mile is 1.6 kilometers.)
 */

public class Exercise01_12 {
	public static void main (String [] args) {
		double inKilometers = 24 * 1.6;
		double perMinute = inKilometers / 100.583333;
		double perHour = perMinute * 60;
		System.out.print(perHour);
		
		
		
	}

}
