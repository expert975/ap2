/**
   08
*/

import java.util.Scanner;

public class WorkerPays
{
	public static void main(String Args[])
	{
		Scanner input = new Scanner(System.in);
		int workerCount;

		System.out.print("Enter worker count: ");
		workerCount = input.nextInt();
		String name[] = new String[workerCount];
		double salary[] = new double[workerCount];

		double salaryAverage;
		double sum = 0;
		double biggestSalary = 0;
		double smallestSalary = Double.MAX_VALUE;
		int iBiggestSalary = 0; //index
		int iSmallestSalary = 0;

		for(int i=0; i<workerCount; i++)
		{
			System.out.printf("%d: Enter name: ", i);
			name[i] = input.next();
			System.out.printf("%d: Enter salary: ", i);
			salary[i] = input.nextDouble();
		}

		for(int i=0; i<workerCount; i++)
			if(salary[i] > biggestSalary)
			{
				iBiggestSalary = i;
				biggestSalary = salary[i];
			}
		System.out.printf("Biggest  salary is %d: %s, %.2f\n",
						  iBiggestSalary,
						  name[iBiggestSalary],
						  salary[iBiggestSalary]);

		for(int i=0; i<workerCount; i++)
			if(salary[i] < smallestSalary)
			{
				iSmallestSalary = i;
				smallestSalary = salary[i];
			}
		System.out.printf("Smallest salary is %d: %s, %.2f\n",
						  iSmallestSalary,
						  name[iSmallestSalary],
						  salary[iSmallestSalary]);

		for(int i=0; i<workerCount; i++)
			sum += salary[i];
		salaryAverage = sum/workerCount;

		System.out.printf("Salaries above average:\n");
		for(int i=0; i<workerCount; i++)
			if(salary[i] > salaryAverage)
				System.out.printf("%s: %.2f\n", name[i], salary[i]);

		System.out.printf("Salaries below average:\n");
		for(int i=0; i<workerCount; i++)
			if(salary[i] < salaryAverage)
				System.out.printf("%s: %.2f\n", name[i], salary[i]);
	}
}
