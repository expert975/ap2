/**
   08
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex8;

import br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex6.Empregado;

public class Operario extends Empregado
{
	private float valorProducao;
	private float comissao;

	public Operario(String nome, String endereço, String telefone,
					int codigoSetor, float salarioBase, float imposto,
					float valorProducao, float comissao)
	{
		super(nome, endereço, telefone, codigoSetor, salarioBase,
			  imposto);
		this.valorProducao = valorProducao;
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
		return super.calcularSalario() + valorProducao*comissao;
	}

	public float getValorProducao()
	{
		return valorProducao;
	}

	public void setValorProducao(float valorProducao)
	{
		this.valorProducao = valorProducao;
	}
}
