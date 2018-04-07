import java.util.Scanner;

public class Trapezium
{
	public static void main(String[] args)
	{
		int  h, b, B, a;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter height: ");
		h = input.nextInt();

		System.out.print("Enter minor base: ");
		b = input.nextInt();

		System.out.print("Enter major base: ");
		B = input.nextInt();

		System.out.printf("Area: %s\n", (h*(b + B))/2);
	}
}
