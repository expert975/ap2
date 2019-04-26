/**
   05, 06
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista06.ex5;

public enum AcademicLevel
{
	NONE(0f), ELEMENTARY(0.1f), HIGH(0.5f), UNIVERSITY(1.0f);

	private final float salaryBonus;

	private AcademicLevel(float salaryBonus)
	{
		this.salaryBonus = salaryBonus;
	}

	public float getSalaryBonus()
	{
		return salaryBonus;
	}
}
