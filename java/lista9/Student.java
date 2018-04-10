public class Student
{
	String name = "";
	float grade = 0F;
	float attendanceRate = 0F;

	public void print()
	{
		System.out.println("\tName: " + name);
		System.out.println("\tAttendance rate: " + attendanceRate);
		System.out.println("\tGrade: " + grade);
		printApprovationStatus();
	}

	public void printApprovationStatus()
	{
		if(grade >= 6F && attendanceRate >= 0.75F)
			System.out.println("\tApproved!");
		else
			System.out.println("\tReproved!");
	}

}
