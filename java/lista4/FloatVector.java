import javax.swing.JOptionPane;

public class FloatVector
{
	private static String inputValue;

	public static void main(String[] args)
	{
		inputValue = JOptionPane.showInputDialog("Diga algo: ");
		System.out.printf("%d", inputValue + 1);
	}


}
