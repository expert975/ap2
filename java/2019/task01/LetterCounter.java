/**
   01
*/

import java.util.Scanner;

public class LetterCounter
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);

	System.out.printf("Enter first name: ");
	String name1 = input.next();
	System.out.printf("Enter second name: ");
	String name2 = input.next();
	System.out.printf("First name length: %d\n", name1.length());
	System.out.printf("Second name length: %d\n", name2.length());
	if(name1.equals(name2))
		System.out.printf("Names are equal\n");
	else
		System.out.printf("Names don't match\n");

	System.out.printf("First name toUpper: %s\n", name1.toUpperCase());
	System.out.printf("Second name toUpper: %s\n", name2.toUpperCase());
	}
}
