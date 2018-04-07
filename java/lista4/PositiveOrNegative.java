import java.util.Scanner;

public class PositiveOrNegative
{
	private static int[] valoresEntrada = new int[8];
	private static int[] valoresNegativos = new int[8];
	private static int[] valoresPositivos = new int[8];
	private static int positiveCount = 0;
	private static int negativeCount = 0;

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		for(int i=0; i<8; i++)
		{
			System.out.print("Enter integer " + i + ": ");
			valoresEntrada[i] = input.nextInt();
		}

		for(int i=0; i<8; i++)
		{
			if(valoresEntrada[i] > 0)
				valoresPositivos[positiveCount++] = valoresEntrada[i];
			else if(valoresEntrada[i] < 0)
				valoresNegativos[negativeCount++] = valoresEntrada[i];
		}

		System.out.println("Positive values: ");
		for(int i=0; i<positiveCount; i++)
			System.out.println(valoresPositivos[i]);

		System.out.println("Negative values: ");
		for(int i=0; i<negativeCount; i++)
			System.out.println(valoresNegativos[i]);
	}
}
