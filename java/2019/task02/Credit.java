/**
   04
*/

import java.util.Scanner;

public class Credit
{
	public static void main(String Args[])
	{
		Scanner input = new Scanner(System.in);

		int meanBalance;
		int bonusCredit;
		System.out.printf("Enter your mean balance: ");
		meanBalance = input.nextInt();

		switch ((  0 <= meanBalance && meanBalance <= 200) ?  0 :
				(201 <= meanBalance && meanBalance <= 400) ? 20 :
				(401 <= meanBalance && meanBalance <= 600) ? 30 : 40)
		{
		case 0:
			bonusCredit = 0;
			break;
		case 20:
			bonusCredit = 20;
			break;
		case 30:
			bonusCredit = 30;
			break;
		case 40:
			bonusCredit = 40;
			break;
		default:
			bonusCredit = 0;
		}
		System.out.printf("Mean balance: %d. Bonus credit: %d%%\n",
						  meanBalance, bonusCredit);
	}
}
