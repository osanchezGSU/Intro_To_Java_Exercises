package Chapter01;

/*
 *(Area and perimeter of a rectangle) 
 *Write a program that displays the area and perimeter 
 *of a rectangle with the width of 4.5 and height of 7.9 
 *using the following formula:
 *area = width * height
 */

public class Exercise01_09 {

	public static void main(String[] args) {
		double width = 4.5, height = 7.9;
		double area, perimeter;
		area = width * height;
		perimeter = 2* (height + width);
		System.out.println(area);
		System.out.println(perimeter);
	}

}
