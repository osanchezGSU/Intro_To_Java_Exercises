package Chapter02;
import java.util.Scanner;

/* (2 star)
 * (Financial application: compound value)
 * Suppose you save $100 each month into 
 * a savings account with the annual 
 * interest rate 5%. Thus, the monthly 
 * interest rate is 0.05/12 = 0.00417. 
 * Write a program that prompts the user 
 * to enter a monthly saving amount and 
 * displays the account value after the 
 * sixth month. 
 */

public class Exercise02_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the monthly saving amount: ");
		double initialAmount = input.nextDouble();
		double amount = initialAmount * (1 + 0.00417);
		
		for (int i = 0; i < 5; i++) {
			double newAmount = (amount + initialAmount) * (1 + 0.00417);
		
			amount = newAmount;
			if (i == 4) {
				System.out.println(newAmount);
			}
			
			
		}
	}

}
