package Chapter02;

import java.util.Scanner;
import java.math.*;

/*
 * (Geometry: area of a hexagon)
 *  Write a program that prompts 
 *  the user to enter the side of a 
 *  hexagon and displays its area. 
 *  The formula is:
 *  Area = ((3 * sqrt(3)) / 2) * s^2 
 */

public class Exercise02_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);
		System.out.print("The area of the hexagon is " +area);
	}

}
