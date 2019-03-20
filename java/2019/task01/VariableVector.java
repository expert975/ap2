/**
   06
*/

import java.util.Scanner;

public class VariableVector
{
	public static void main(String Args[])
	{
		Scanner input = new Scanner(System.in);
		int vectorSize;

		System.out.print("Enter vector size: ");
		vectorSize = input.nextInt();
		int vector[] = new int[vectorSize];
		int tmp;
		int numberToBeFound;
		boolean wasNumberFound = false;

		for(int i=0; i<vectorSize; i++)
		{
			System.out.printf("%d: Enter number: ", i);
			vector[i] = input.nextInt();
		}

		for(int i=0; i<vectorSize; i++)
			for(int j=i+1; j<vectorSize; j++)
				if(vector[j] < vector[i])
				{
					tmp = vector[j];
					vector[j] = vector[i];
					vector[i] = tmp;
				}

		System.out.printf("Ordered:\n");
		for(int i=0; i<vectorSize; i++)
			System.out.printf("%d: %d\n", i, vector[i]);

		System.out.printf("Reversed:\n");
		for(int i=vectorSize - 1; i>=0; i--)
			System.out.printf("%d: %d\n", i, vector[i]);

		System.out.printf("Enter number to be found: ");
		numberToBeFound = input.nextInt();
		for(int i=0; i<vectorSize; i++)
			if(numberToBeFound == vector[i])
			{
				System.out.printf("%d found at position %d\n", vector[i], i);
				wasNumberFound = true;
			}
		if(!wasNumberFound)
			System.out.printf("%d was not found\n", numberToBeFound);
	}
}
