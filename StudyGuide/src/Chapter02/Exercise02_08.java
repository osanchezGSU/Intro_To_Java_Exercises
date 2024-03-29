package Chapter02;

import java.util.Scanner;

/* (1 star)
 * (Current time)
 * Listing 2.7, ShowCurrentTime.java,
 * gives a program that displays the current 
 * time in GMT. Revise the program so that it
 * prompts the user to enter the time zone
 * offset to GMT and displays the time in the 
 * specified time zone. 
 */

public class Exercise02_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		int currentTime = (int)(currentHour) + offset;
		System.out.println("The current time is "+currentTime+":"+currentMinute+":"+currentSecond);
		
		
	}

}
