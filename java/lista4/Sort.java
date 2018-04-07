import java.util.Random;

public class Sort
{
	public static void main(String[] args)
	{
		int[] vector = new int[10];
		int placeHolder = 0;
		Random random = new Random();

		for(int i=0; i<10; i++)
		{
			vector[i] = random.nextInt(100);
		}

		System.out.println("Vector before sorting: ");
		for(int i=0; i<10; i++)
		{
			System.out.println(vector[i]);
		}

		for(int i=0; i<10; i++)
		{
			for(int j=i; j<10; j++)
			{
				if(vector[j] < vector[i])
				{
					placeHolder = vector[i];
					vector[i] = vector[j];
					vector[j] = placeHolder;
				}
			}
		}

		System.out.println("Vector after sorting: ");
		for(int i=0; i<10; i++)
		{
			System.out.println(vector[i]);
		}
	}
}
