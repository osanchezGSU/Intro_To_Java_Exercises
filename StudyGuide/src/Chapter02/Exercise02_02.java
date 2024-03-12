package Chapter02;
import java.util.Scanner;
import java.math.*;

/*
 * (Compute the volume of a cylinder)
 *  Write a program that reads in the radius and 
 *  length of a cylinder and computes the area and 
 *  volume using the following formulas:
 *  area = radius * radius * pi
 *  volume = area * length
 */

public class Exercise02_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		System.out.println("The area is " +area);
		System.out.println("The volume is " +volume);
		
		

	}

}
