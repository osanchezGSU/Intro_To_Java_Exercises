package Chapter02;
import java.util.Scanner;
/* (star 1)
 * (Financial application: calculate
 *  interest)
 * If you know the balance and the 
 * annual percentage interest rate, 
 * you can compute the interest on the 
 * next monthly payment using the 
 * following formula:
 * interest = balance * (annualInterestRate/1200)
 * Write a program that reads the 
 * balance and the annual percentage interest rate and
 * displays the interest for the next month. 
 */

public class Exercise02_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double balance, interestRate;
		System.out.print("Enter balance and interest rate: ");
		balance = input.nextDouble();
		interestRate = input.nextDouble();
		
		double interest = balance * (interestRate / 1200);
		System.out.print("The interest is " +interest);

	}

}
