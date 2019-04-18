/**
   02
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex2;

public class Empregado
{
	private String nome;
	protected float salario;

	public Empregado(String nome, float salario)
	{
		this.nome = nome;
		this. salario = salario;
	}

	public float getSalario()
	{
		return salario;
	}

	public void setSalario(float salario)
	{
		this.salario = salario;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	@Override
	public String toString()
	{
		return "Nome: " + nome + ". Salário: " + salario + ".";
	}
}
