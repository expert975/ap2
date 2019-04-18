/**
   02
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex2;

public class Vendedor extends Empregado
{
	private float comissao;

	public Vendedor(String nome, float salario, float comissao)
	{
		super(nome, salario);
		this.comissao = comissao;
	}

	@Override
	public float getSalario()
	{
		return calcularSalario();
	}

	private float calcularSalario()
	{
		return super.getSalario() + super.getSalario()*comissao;
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
	public String toString()
	{
		return super.toString()
			+ " Salário sem comissao: " + super.getSalario()
			+ ". Salário com comissão: " + getSalario()
			+ " Comissão: " + comissao + "%.";
	}
}
