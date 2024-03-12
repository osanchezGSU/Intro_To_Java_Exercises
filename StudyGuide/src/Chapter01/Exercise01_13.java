package Chapter01;

/*(1 star)
 * (Algebra solve 2 x 2 linear equations)
 * You can use Cramer's rule to solve the following 
 * 2 x 2 system of linear equation:
 * 3.4x = 50.y = 44.5
 * 2.1x + .55y = 5.9
 */

public class Exercise01_13 {

	public static void main(String[] args) {
		double a = 3.4, b = 50.2, e = 44.5, c = 2.1, d = .55, f = 5.9;
		
		double x = (e * d - b * f) / (a * d - b *c);
		double y = (a * f - e *c) / (a * d - b *c);
		System.out.println(x);
		System.out.println(y);
		
		
	

	}

}
