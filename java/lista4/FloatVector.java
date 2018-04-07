import javax.swing.JOptionPane;

public class FloatVector
{
	private static String inputValue;
	private static float inputFloat;
	private static float sum = 0;
	private static float[] floatVector = new float[10];

	public static void main(String[] args)
	{
		for(int i=0; i<10; i++)
		{
			inputValue = JOptionPane.showInputDialog("Enter position number " + (i + 1));
			inputFloat = Float.parseFloat(inputValue);
			floatVector[i] = inputFloat;
		}

		for(int i=0; i<10; i++)
			sum += floatVector[i];
		JOptionPane.showMessageDialog(null, "The sum is: " + sum);

	}


}
