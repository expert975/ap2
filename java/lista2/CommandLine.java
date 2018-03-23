public class CommandLine
{
	public static void main(String[] args)
	{
		if (args.length > 0)
			System.out.printf("%s args:\n", args.length);
		for(int i=0; i<args.length; i++)
			System.out.printf("%s\n", args[i]);
	}
}
