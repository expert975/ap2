/**
   08
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista06.ex5;

public enum Rank
{
	MANAGER(1500f), SUPERVISOR(600f), SELLER(250f);

	private final float salaryBonus;

	private Rank(float salaryBonus)
	{
		this.salaryBonus = salaryBonus;
	}

	public float getSalaryBonus()
	{
		return salaryBonus;
	}
}
