package Chapter01;

/*(1 star)
 * (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
■ One birth every 7 seconds
■ One death every 13 seconds
■ One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. 
Assume the current population is 312,032,486 and one year has 365 days. 
Hint: In Java, if two integers perform division, the result is an integer. 
The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). 
To get an accurate result with the fractional part, one of the values involved in the division must be a number with a decimal point. 
For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */

public class Exercise01_11 {

	public static void main(String[] args) {
		double secondsPerYear = 60 * 60 * 24 * 365;
		double birthsPerYear = secondsPerYear / 7;
		double deathsPerYear = secondsPerYear / 13;
		double immigrantsPerYear = secondsPerYear / 45;
		double currentPopulation = 312_032_486;
	
		for (int i = 0; i < 5; i++) {
			
			double afterOneYear = currentPopulation + birthsPerYear + immigrantsPerYear - deathsPerYear;
			System.out.println(afterOneYear);
			currentPopulation = afterOneYear;
			
		}

	}

}
