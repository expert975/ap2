/**
   01
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista06.ex1;

public abstract class Animal
{
	private String name;
	private int age;

	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public abstract void talk();
	public abstract void act();

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
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
