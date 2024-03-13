package Chapter02;
import java.util.Scanner;
import java.math.*;

/* (1 star)
 * (Financial application: calculate future investment value) 
 * Write a program that reads in investment amount, annual 
 * interest rate, and number of years, and displays the 
 * future investment value using the following formula:
 * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
 */

public class Exercise02_21 {

	public static void main(String[] args) {
		double investmentAmount, monthlyInterestRate, annualInterestRate, numberOfYears, futureInvestmentValue;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter investment amount: ");
		investmentAmount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		annualInterestRate = input.nextDouble();
		System.out.print("Enter number of years: ");
		numberOfYears = input.nextDouble();
		
		monthlyInterestRate = (annualInterestRate / 12) / 100;
		
		futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears*12));
		
		System.out.println("Accumulated value is $" +futureInvestmentValue);
		
		
		
	}

}
