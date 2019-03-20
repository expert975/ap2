/**
   05
*/

import java.util.Scanner;

public class FixedVector
{
	public static void main(String Args[])
	{
		Scanner input = new Scanner(System.in);
		int vector[] = new int[10];
		long squared[] = new long[10];
		long sum = 0;

		for(int i=0; i<10; i++)
		{
			System.out.printf("%d: Enter number: ", i);
			vector[i] = input.nextInt();
		}

		for(int i=0; i<10; i++)
			sum += vector[i];
		System.out.printf("Total sum: %d\n", sum);
		System.out.printf("Mean: %f\n", sum/10.0);

		for(int i=0; i<10; i++)
		{
			squared[i] = vector[i]*vector[i];
			System.out.printf("Squares: %d: %d\n", i, squared[i]);
		}

		System.out.printf("Reverse order:\n");
		for(int i=9; i>=0; i--)
			System.out.printf("%d\n", vector[i]);
	}
}
