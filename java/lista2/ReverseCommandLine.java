public class ReverseCommandLine
{
	public static void main(String[] args)
	{
		if (args.length == 3)
		{
//			System.out.printf("%s args:\n", args.length);

			for(int i=2; i>=0; i--)
				System.out.printf("%s\n", args[i]);
		}
		else
			System.out.println("Please run this program with 3 arguments!");

	}
}
