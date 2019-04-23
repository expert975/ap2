/**
   05
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex5;

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex4.Pessoa;

public class Fornecedor extends Pessoa
{
	private float valorCredito;
	private float valorDivida;

	public Fornecedor(String nome, String endereço, String telefone,
					  float valorCredito, float valorDivida)
	{
		super(nome, endereço, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public float obterSaldo()
	{
		return valorCredito - valorDivida;
	}

	public float getValorDivida()
	{
		return valorDivida;
	}

	public void setValorDivida(float valorDivida)
	{
		this.valorDivida = valorDivida;
	}

	public float getValorCredito()
	{
		return valorCredito;
	}

	public void setValorCredito(float valorCredito)
	{
		this.valorCredito = valorCredito;
	}

}
