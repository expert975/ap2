import java.util.*;

public class Subject
{
	String name = "";
	String place = "";
	String schedule = "";
	Professor professor;
	List<Student> students = new ArrayList<Student>();

	public void setProfessor(Professor newProfessor)
	{
		professor = newProfessor;
	}

	public void addStudent(Student newStudent)
	{
		students.add(newStudent);
	}

	public void printInfo()
	{
		System.out.println("Subject:");
		System.out.println("\tName: " + name);
		System.out.println("\tPlace: " + place);
		System.out.println("\tSchedule: " + schedule);
		System.out.println();

		System.out.println("Professor:");
		professor.print();
		System.out.println();

		System.out.println("Students:");
		printStudents();
	}

	private void printStudents()
	{
		Iterator iterator = students.iterator();
		while(iterator.hasNext())
		{
			Student student = (Student) iterator.next();
			student.print();
			System.out.println();
		}
	}
}
