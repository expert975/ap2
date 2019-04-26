/**
   05, 06, 08, 09, 11
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista06.ex5;

public class Worker
{
	private static final float baseSalary = 1000;
	private String name;
	private String functionalCode;
	private AcademicLevel academicLevel;
	private Rank rank;
	private String elementarySchool;
	private String highSchool;
	private String university;

	private static float calculateSalary(AcademicLevel academicLevel, Rank rank)
	{
		float salary = baseSalary;

		salary += salary*academicLevel.NONE.getSalaryBonus();
		if(academicLevel == AcademicLevel.NONE)
			return salary;

		salary += salary*academicLevel.ELEMENTARY.getSalaryBonus();
		if(academicLevel == AcademicLevel.ELEMENTARY)
			return salary;

		salary += salary*academicLevel.HIGH.getSalaryBonus();
		if(academicLevel == AcademicLevel.HIGH)
			return salary;

		salary += salary*academicLevel.UNIVERSITY.getSalaryBonus();
		return salary + rank.getSalaryBonus();
	}

	public Worker(String name, String functionalCode, Rank rank,
				  String elementarySchool, String highSchool, String university)
	{
		this(name, functionalCode, rank, elementarySchool, highSchool);
		this.university = university;
		this.academicLevel = AcademicLevel.UNIVERSITY;
	}

	public Worker(String name, String functionalCode, Rank rank,
				  String elementarySchool, String highSchool)
	{
		this(name, functionalCode, rank, elementarySchool);
		this.highSchool = highSchool;
		this.academicLevel = AcademicLevel.HIGH;
	}

	public Worker(String name, String functionalCode, Rank rank,
				  String elementarySchool)
	{
		this(name, functionalCode, rank);
		this.elementarySchool = elementarySchool;
		this.academicLevel = AcademicLevel.ELEMENTARY;
	}

	public Worker(String name, String functionalCode, Rank rank)
	{
		this.name = name;
		this.functionalCode = functionalCode;
		this.rank = rank;
		this.academicLevel = AcademicLevel.NONE;
	}

	public float getSalary()
	{
		return calculateSalary(academicLevel, rank);
	}

	public AcademicLevel getAcademicLevel()
	{
		return academicLevel;
	}

	private void setAcademicLevel(AcademicLevel academicLevel)
	{
		this.academicLevel = academicLevel;
	}

	public String getFunctionalCode()
	{
		return functionalCode;
	}

	public void setFunctionalCode(String functionalCode)
	{
		this.functionalCode = functionalCode;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Name: " + name
			+ ". Funcional code: " + functionalCode
			+ ". Academic level: " + academicLevel
			+ ". Salary: R$ " + getSalary()
			+ ". Commission: R$ " + rank.getSalaryBonus();
	}
}
