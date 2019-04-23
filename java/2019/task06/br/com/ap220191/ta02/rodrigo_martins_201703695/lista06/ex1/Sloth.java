/**
   01
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista06.ex1;

public class Sloth extends Animal
{
	public Sloth(String name, int age)
	{
		super(name, age);
	}

	//http://www.youtube.com/watch?v=5Tdokh1KYuQ
	@Override
	public void talk()
	{
		System.out.println("aaaah");
	}

	@Override
	public void act()
	{
		System.out.println("climb");
	}

}
