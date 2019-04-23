/**
   07
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex7;

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex6.Empregado;

public class Administrador extends Empregado
{
	private float ajudaDeCusto;

	public Administrador(String nome, String endereço, String telefone,
						 int codigoSetor, float salarioBase, float imposto,
						 float ajudaDeCusto)
	{
		super(nome, endereço, telefone, codigoSetor, salarioBase,
			  imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public float calcularSalario()
	{
		return super.calcularSalario() + ajudaDeCusto;
	}

	public float getAjudaDeCusto()
	{
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto)
	{
		this.ajudaDeCusto = ajudaDeCusto;
	}
}
