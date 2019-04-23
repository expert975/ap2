/**
   04
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista06.ex1;

public class Zoo
{
	private Animal[] cage;

	public Zoo(Animal a0, Animal a1, Animal a2, Animal a3, Animal a4,
			   Animal a5, Animal a6, Animal a7, Animal a8, Animal a9 )
	{
		cage = new Animal[]{a0, a1, a2, a3, a4, a5, a6, a7, a8, a9};
	}

	public void shakeCages()
	{
		for(int i=0; i < 10; i++)
			cage[i].act();
	}
}
