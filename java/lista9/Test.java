public class Test
{
	public static void main(String[] args)
	{

		Professor professor = new Professor();
		professor.age = 83;
		professor.name = "Rafael";
		professor.degree = "Masters";

		Student student1 = new Student();
		student1.name = "Maria";
		student1.grade = 6.6F;
		student1.attendanceRate = 0.76F;

		Student student2 = new Student();
		student2.name = "Mario";
		student2.grade = 7.5F;
		student2.attendanceRate = 0.35F;

		Student student3 = new Student();
		student3.name = "Cludio";
		student3.grade = 5.5F;
		student3.attendanceRate = 0.80F;

		Subject subject = new Subject();
		subject.name = "AP2";
		subject.place = "Praça Universitária";
		subject.schedule = "36M12";
		subject.setProfessor(professor);
		subject.addStudent(student1);
		subject.addStudent(student2);
		subject.addStudent(student3);

		subject.printInfo();

	}
}

