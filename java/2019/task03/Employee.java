/**
   05
*/

import java.util.Date;

public class Employee
{
	private String name;
	private float salary;
	private Date admissionDate;
	private String departament;

	public Employee(String name, float salary, Date admissionDate,
					String departament)
	{
		this.name = name;
		this.salary = salary;
		this.admissionDate = admissionDate;
		this.departament = departament;
	}

	public String getDepartament()
	{
		return departament;
	}

	public void setDepartament(String departament)
	{
		this.departament = departament;
	}

	public Date getAdmissionDate()
	{
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate)
	{
		this.admissionDate = admissionDate;
	}

	public float getSalary()
	{
		return salary;
	}

	public void setSalary(float salary)
	{
		this.salary = salary;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
