/**
   03
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex3;

public class ContaEspecial extends ContaCorrente
{
	private float limite;

	public ContaEspecial(float saldo, float limite)
	{
		super(saldo);
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor)
	{
		if((super.getSaldo() + limite) >= valor)
		{
			super.unsafeSacar(valor);
			return true;
		}
		else
			return false;
	}

	@Override
	public String toString()
	{
		return super.toString() + " Limite: " + limite + ".";
	}

	public float getLimite()
	{
		return limite;
	}

	public void setLimite(float limite)
	{
		this.limite = limite;
	}
}
