package Chapter02;
import java.util.Scanner;

/* (1 star)
 * (Financial application: calculate tips) 
 * Write a program that reads the subtotal 
 * and the gratuity rate, then computes the 
 * gratuity and total. For example, if the 
 * user enters 10 for subtotal and 15% for 
 * gratuity rate, the program displays $1.5 
 * as gratuity and $11.5 as total. 
 */

public class Exercise02_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		double tipAmount = subtotal * (gratuityRate / 100) ;
		double total = tipAmount + subtotal;
		
		System.out.println("The gratuity is $" +tipAmount+ " and the total is $" +total);
		
		
		

	}

}
