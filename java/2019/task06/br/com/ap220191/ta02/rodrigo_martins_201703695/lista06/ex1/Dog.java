/**
   01
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista06.ex1;

public class Dog extends Animal
{
	public Dog(String name, int age)
	{
		super(name, age);
	}

	@Override
	public void talk()
	{
		System.out.println("Woof");
	}

	@Override
	public void act()
	{
		System.out.println("run");
	}

}
