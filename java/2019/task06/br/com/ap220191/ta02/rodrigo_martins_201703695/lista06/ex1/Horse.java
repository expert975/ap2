/**
   01
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista06.ex1;

public class Horse extends Animal
{
	public Horse(String name, int age)
	{
		super(name, age);
	}

	@Override
	public void talk()
	{
		System.out.println("houyhnhnm");
	}

	@Override
	public void act()
	{
		System.out.println("run");
	}

}
