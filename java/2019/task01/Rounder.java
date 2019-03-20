/**
   02
*/

import java.lang.Math;
import java.util.Scanner;

public class Rounder
{
	public static void main(String Args[])
	{
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		double number = input.nextDouble();

		System.out.printf("rint: %f\n", Math.rint(number));
		System.out.printf("round(double) %d\n", Math.round(number));
		System.out.printf("round(float) %d\n", Math.round((float)number));
	}
}
