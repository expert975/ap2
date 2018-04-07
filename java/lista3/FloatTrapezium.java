import java.util.Scanner;

public class FloatTrapezium
{
	public static void main(String[] args)
	{
		float  h, b, B, a;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter height: ");
		h = input.nextFloat();

		System.out.print("Enter minor base: ");
		b = input.nextFloat();

		System.out.print("Enter major base: ");
		B = input.nextFloat();

		a = (h*(b + B))/2;

		System.out.printf("Area: %s\n", a);

		System.out.println (a-(int)a == 0);
	}
}
