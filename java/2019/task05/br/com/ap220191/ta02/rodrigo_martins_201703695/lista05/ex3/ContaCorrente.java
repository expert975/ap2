/**
   03
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex3;

public class ContaCorrente
{
	protected float saldo;

	public ContaCorrente()
	{
		saldo = 0;
	}

	public ContaCorrente(float saldo)
	{
		this.saldo = saldo;
	}

	public void depositar(float valor)
	{
		saldo += valor;
	}

	public boolean sacar(float valor)
	{
		if(valor <= saldo)
		{
			saldo -= valor;
			return true;
		}
		else
			return false;
	}

	protected void unsafeSacar(float valor)
	{
		saldo -= valor;
	}

	public boolean transferir(ContaCorrente conta)
	{
		float amount = saldo;
		if(this.sacar(amount))
			return false;
		else
		{
			conta.depositar(amount);
			return true;
		}
	}

	@Override
	public String toString()
	{
		return "Saldo: " + saldo + ".";
	}

	public float getSaldo()
	{
		return saldo;
	}

	public void setSaldo(float saldo)
	{
		this.saldo = saldo;
	}

}
