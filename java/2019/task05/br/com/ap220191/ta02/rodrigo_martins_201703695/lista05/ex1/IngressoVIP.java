/**
   01
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex1;

public class IngressoVIP extends Ingresso
{
	private float valorAdicional;

	@Override
	public float getValor()
	{
		return super.getValor() + valorAdicional;
	}

	public float getValorAdicional()
	{
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional)
	{
		this.valorAdicional = valorAdicional;
	}
}
