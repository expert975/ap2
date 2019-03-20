/**
   03
*/

import java.util.Scanner;

public class BiggerSmaller
{
	public static void main(String Args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number1 = input.nextDouble();
		System.out.print("Enter a number: ");
		double number2 = input.nextDouble();

		if(number1 > number2)
			System.out.printf("%f > %f\n", number1, number2);
		else if(number1 < number2)
			System.out.printf("%f < %f\n", number1, number2);
		else
			System.out.printf("%f == %f\n", number1, number2);
	}
}
