package Chapter02;
import java.util.Scanner;
import java.math.*;

/*
 * (Health application: computing BMI) 
 * Body Mass Index (BMI) is a measure 
 * of health on weight. It can be 
 * calculated by taking your weight 
 * in kilograms and dividing by the 
 * square of your height in meters. 
 * Write a program that prompts the 
 * user to enter a weight in pounds 
 * and height in inches and displays 
 * the BMI. Note that one pound is 
 * 0.45359237 kilograms and one inch 
 * is 0.0254 meters. 
 */

public class Exercise02_14 {

	public static void main(String[] args) {
		double pounds, inches;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter weight in pounds: ");
		pounds = input.nextDouble();
		System.out.print("Enter height in inches: ");
		inches = input.nextDouble();
		
		double kilograms = pounds * 0.45359237;
		double meters = inches * 0.0254;
		
		double bmi = kilograms / Math.pow(meters, 2);
		System.out.println("BMI is " +bmi);
		
		
		
		
	}

}
