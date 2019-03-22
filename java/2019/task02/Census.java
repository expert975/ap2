/**
   03
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Census
{
	public static void main(String Args[])
	{
		Scanner input = new Scanner(System.in);
		int populationCount = -1;

		List<String> name = new ArrayList<>();
		List<Integer> age = new ArrayList<>();
		List<String> sex = new ArrayList<>();
		List<String> eyeColor = new ArrayList<>();
		List<String> hairColor = new ArrayList<>();

		int selectedProfileCount = 0;
		int biggestAge = 0;
		int iBiggestAge = 0; //index

		do
		{
			System.out.printf("%d: Enter name: ", populationCount+1);
			name.add(input.next());
			System.out.printf("%d: Enter age: ", populationCount+1);
			age.add(input.nextInt());
			System.out.printf("%d: Enter sex[f/m]: ", populationCount+1);
			sex.add(input.next());
			System.out.printf("%d: Enter eye color: ", populationCount+1);
			eyeColor.add(input.next());
			System.out.printf("%d: Enter hair color: ", populationCount+1);
			hairColor.add(input.next());
			populationCount++;
		}
		while(age.get(populationCount) != -1);
		System.out.printf("You entered %d individuals\n", populationCount);

		for(int i=0; i<populationCount; i++)
			if(age.get(i) > biggestAge)
			{
				iBiggestAge = i;
				biggestAge = age.get(i);
			}
		System.out.printf("Biggest age is %s: %d\n",
						  iBiggestAge,
						  name.get(iBiggestAge),
						  age.get(iBiggestAge));

		for(int i=0; i<populationCount; i++)
		{
			if(age.get(i) >= 18
			   && age.get(i) <= 35
			   && sex.get(i) == "f"
			   && eyeColor.get(i) == "green"
			   && hairColor.get(i) == "blond")
				selectedProfileCount++;
		}

		if(selectedProfileCount != 0)
			System.out.printf("No individual matches the criteria\n");
		else
			System.out.printf("Selected profile percent: %f\n",
							  populationCount/selectedProfileCount);
	}
}
