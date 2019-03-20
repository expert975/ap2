/**
   07
*/

import java.util.Scanner;

public class PhoneBook
{
	public static void main(String Args[])
	{
		Scanner input = new Scanner(System.in);
		String name, phone;

		System.out.print("Enter name: ");
		name = input.nextLine();
		System.out.print("Enter phone: ");
		phone = input.next();

		for(int i=0; i<name.length(); i++)
			if(!Character.isLetter(name.charAt(i)))
			{
				System.out.println("Invalid name!");
				break;
			}
		for(int i=0; i<phone.length(); i++)
			if(!Character.isDigit(phone.charAt(i)))
			{
				System.out.println("Invalid number!");
				break;
			}
	}
}
