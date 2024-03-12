package Chapter01;

/*
 * (Average speed in miles) 
 * Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 *  Write a program that displays the average speed in miles per hour. 
 *  (Note that 1 mile is 1.6 kilometers.)
 */

public class Exercise01_10 {

	public static void main(String[] args) {
		double miles = 14 / 1.6;
		double perMinute = miles / 45.5;
		double perHour = perMinute * 60;
		System.out.println(perHour);
		
		

	}

}
