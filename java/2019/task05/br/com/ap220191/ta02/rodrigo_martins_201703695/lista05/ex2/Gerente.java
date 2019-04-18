/**
   02
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex2;

public class Gerente extends Empregado
{
	private String departamento;

	public Gerente(String nome, float salario, String departamento)
	{
		super(nome, salario);
		this.departamento = departamento;
	}

	public String getDepartamento()
	{
		return departamento;
	}

	public void setDepartamento(String departamento)
	{
		this.departamento = departamento;
	}

	@Override
	public String toString()
	{
		return super.toString() + " Departamento: " + departamento + ".";
	}
}
