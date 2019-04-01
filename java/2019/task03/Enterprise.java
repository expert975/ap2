/**
   05
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Enterprise
{
	private String name;
	private String cnpj;
	private ArrayList<Employee> employeeList;

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter employee count: ");
		int employeeCount = scanner.nextInt();
		Enterprise myEnterprise = new Enterprise("EnterpriseName",
												 "12345678901230");
		for(int i=0; i<employeeCount; i++)
			myEnterprise.addEmployee(new Employee("employee" + i  + "Name",
												  i + 100.00f, new Date(),
												  "kitchen"));
		for(Employee employee: myEnterprise.getEmployeeList())
		{
			System.out.print("Name: " + employee.getName());
			System.out.print(" Date: " +employee.getAdmissionDate().toString());
			System.out.print(" Salary: " + employee.getSalary());
			System.out.print(" Departament: " + employee.getDepartament());
			System.out.println();
		}
		System.out.printf("Salaries raised!\n");
		myEnterprise.raiseSalary(0.10f, "kitchen");
		for(Employee employee: myEnterprise.getEmployeeList())
		{
			System.out.print("Name: " + employee.getName());
			System.out.print(" Date: " +employee.getAdmissionDate().toString());
			System.out.print(" Salary: " + employee.getSalary());
			System.out.print(" Departament: " + employee.getDepartament());
			System.out.println();
		}
	}

	public Enterprise(String name, String cnpj)
	{
		this.name = name;
		this.cnpj = cnpj;
		employeeList = new ArrayList<Employee>();
	}

	public void raiseSalary(float percent, String departament)
	{
		for(Employee employee: employeeList)
			if(employee.getDepartament().equals(departament))
				employee.setSalary(employee.getSalary()
								   + employee.getSalary()*percent);
	}

	public ArrayList<Employee>  getEmployeeList()
	{
		return employeeList;
	}

	public void addEmployee(Employee employee)
	{
		employeeList.add(employee);
	}

	public void removeEmployee(Employee employee)
	{
		employeeList.remove(employee);
	}

	public String getCnpj()
	{
		return cnpj;
	}

	public void setCnpj(String cnpj)
	{
		this.cnpj = cnpj;
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
