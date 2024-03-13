package Chapter02;
import java.util.Scanner;
import java.math.*;

/* (1 star)
 * Geometry: area of a triangle)
 *  Write a program that prompts the user to enter 
 *  three points(x1, y1),(x2, y2),(x3,y3)of a triangle 
 *  and displays its area. The formula for computing the 
 *  area of a triangle is:
 *  s = (side1 + side2 + side3)/2;
 *  area = sqrt(s(s-side1)(s-side2)(s - side3))
 */

public class Exercise02_19 {

	public static void main(String[] args) {
		double x1, y1, x2, y2, x3, y3;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		
		double side1, side2, side3;
		side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		side3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		
		double s, radicand, area;
		s = (side1 + side2 + side3) /2;
		radicand = s * (s - side1) * (s - side2) * (s - side3);
		area = Math.sqrt(Math.abs(radicand));
		System.out.println("The area of the triangle is " +area);
		
		
		

	}

}
