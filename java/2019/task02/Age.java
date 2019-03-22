/**
   01
*/

import java.util.Scanner;

public class Age
{
	public static void main(String Args[])
	{
		int PERSON_COUNT = 3;
		Scanner input = new Scanner(System.in);

		String name[] = new String[PERSON_COUNT];
		int age[] = new int[PERSON_COUNT];

		int biggestAge = 0;
		int smallestAge = Integer.MAX_VALUE;
		int iBiggestAge = 0; //index
		int iSmallestAge = 0;

		for(int i=0; i<PERSON_COUNT; i++)
		{
			System.out.printf("%d: Enter name: ", i);
			name[i] = input.next();
			System.out.printf("%d: Enter age: ", i);
			age[i] = input.nextInt();
		}

		for(int i=0; i<PERSON_COUNT; i++)
			if(age[i] > biggestAge)
			{
				iBiggestAge = i;
				biggestAge = age[i];
			}
		System.out.printf("Biggest  age is %d: %s, %d\n",
						  iBiggestAge,
						  name[iBiggestAge],
						  age[iBiggestAge]);

		for(int i=0; i<PERSON_COUNT; i++)
			if(age[i] < smallestAge)
			{
				iSmallestAge = i;
				smallestAge = age[i];
			}
		System.out.printf("Smallest age is %d: %s, %d\n",
						  iSmallestAge,
						  name[iSmallestAge],
						  age[iSmallestAge]);
	}
}
