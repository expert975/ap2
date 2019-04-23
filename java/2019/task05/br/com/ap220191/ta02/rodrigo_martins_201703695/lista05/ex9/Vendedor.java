/**
   09
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex9;

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex6.Empregado;

public class Vendedor extends Empregado
{
	private float valorVendas;
	private float comissao;

	public Vendedor(String nome, String endereço, String telefone,
					int codigoSetor, float salarioBase, float imposto,
					float valorVendas, float comissao)
	{
		super(nome, endereço, telefone, codigoSetor, salarioBase,
			  imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public float getComissao()
	{
		return comissao;
	}

	public void setComissao(float comissao)
	{
		this.comissao = comissao;
	}

	@Override
	public float calcularSalario()
	{
		return super.calcularSalario() + valorVendas*comissao;
	}

	public float getValorVendas()
	{
		return valorVendas;
	}

	public void setValorVendas(float valorVendas)
	{
		this.valorVendas = valorVendas;
	}
}
