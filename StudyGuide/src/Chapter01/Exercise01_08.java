package Chapter01;
import java.math.*;

/*
 * (Area and perimeter of a circle)
 * Write a program of a circle that has a radius of
 * 5.5 using the following formula:
 * perimeter = 2 x radius x pi
 * area = radius x radius x pi
 */
public class Exercise01_08 {
	public static void main (String [] args) {
		double radius = 5.5;
		double perimeter = 2 * radius * Math.PI;
		double area = radius * radius * Math.PI;
		System.out.println("The perimeter of a circle with the radius of 5.5 is: " +perimeter);
		System.out.println("The area of a circle with the radius of 5.5 is:"  +area);
		
	}

}
