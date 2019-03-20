/**
   09
*/

import java.util.Scanner;

public class CpfValidator
{
	public static void main(String Args[])
	{
		Scanner input = new Scanner(System.in);
		String cpf;
		System.out.print("Enter CPF: ");
		cpf = input.next();
		if(validateCPF(cpf))
			System.out.printf("Valid CPF\n");
		else
			System.out.printf("Invalid CPF\n");
	}

	private static boolean validateCPF(String cpf)
	{
		int[] cpfDigits = new int[11];
		if(cpf.length() != 11)
			return false;

		if(canConvertToInt(cpf))
			cpfDigits = convertStringToIntVector(cpf);
		else
			return false;

		if(!checkVerificationDigits(cpfDigits))
			return false;

		return true;
	}

	private static boolean checkVerificationDigits(int[] digits)
	{
		int[] verif = new int[2];
		verif[0] = 10*digits[0] + 9*digits[1]  + 8*digits[2]
			+ 7*digits[3] + 6*digits[4] + 5*digits[5]
			+ 4*digits[6]  + 3*digits[7] + 2*digits[8];
		verif[0] = 11 - (verif[0] % 11);
		if(verif[0] >= 10)
			verif[0] = 0;

		verif[1] = 11*digits[0] + 10*digits[1]	+ 9*digits[2]
			+ 8*digits[3] + 7*digits[4] + 6*digits[5]
			+ 5*digits[6]  + 4*digits[7] + 3*digits[8]
			+ 2*digits[9];
		verif[1] = 11 - (verif[1] % 11);
		if(verif[1] >= 10)
			verif[1] = 0;

		return verif[0] == digits[9] && verif[1] == digits[10];
	}

	private static boolean canConvertToInt(String string)
	{
		for(int i=0; i<string.length(); i++)
			if(!Character.isDigit(string.charAt(i)))
				return false;
		return true;
	}

	private static int[] convertStringToIntVector(String string)
	{
		int[] intVec = new int[string.length()];
		for(int i=0; i<string.length(); i++)
			intVec[i] = Character.getNumericValue(string.charAt(i));
		return intVec;
	}
}
