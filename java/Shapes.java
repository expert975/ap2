import java.util.Scanner;

public class Shapes
{
	public static void main(String[] args)
	{
		drawSquare();
		drawDiamond();
	}

	public static void drawSquare()
	{
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<5; j++)
			{
				System.out.printf("%s", "* ");
			}
			System.out.println();
		}
	}

	public static void drawDiamond()
	{
		System.out.println("    *    ");
		System.out.println("  *   *  ");
		System.out.println("*   *   *");
		System.out.println("  *   *  ");
		System.out.println("    *    ");
	}
}
