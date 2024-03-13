package Chapter02;

/*
 * (Print a table) Write a program that displays the following table. Cast floating- point numbers into integers.
 *  a b pow(a, b) 
 *  1 2 1 
 *  2 3 8
 *  3 4 81
 *  4 5 1024 
 *  5 6 15625
 */

public class Exercise02_18 {

	public static void main(String[] args) {
		System.out.print("a b pow(a, b)");
		int a = 1;
		int b = 2;
		for (int i = 0; i < 5; i++) {
			double pow = Math.pow(a, b);
			System.out.println("\n"+a+ " " +b+ " " +(int)pow);
			a += 1;
			b += 1;
			
		}
		

	}

}
