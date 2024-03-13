package Chapter02;

import java.util.Scanner;
import java.math.*;

/*
 * (Geometry distance of two points)
 * Write a program that prompts the user 
 * to enter to points (x1, y1) and 
 * (x2, y2) and display their distance
 * between them using the following formula: 
 * sqrt((x2 - x1)^2 + (y2 - y1)^2).
 * 
 */

public class Exercise02_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double x1, x2, y1, y2;
		System.out.print("Enter x1 and y1:  ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.print("Enter x2 and y2:  ");
		x2 = input.nextDouble();
	y2 = input.nextDouble();
		
		double radicand = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		double distance = Math.sqrt(radicand);
		System.out.print("The distance between the two points is " +distance);
	}

}
