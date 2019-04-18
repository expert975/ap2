/**
   03
*/

package br.com.ap220191.ta02.rodrigo_martins_201703695.lista05.ex3;

public class Cliente
{
	private String nome;

	public Cliente() {}

	public Cliente(String nome)
	{
		this.nome = nome;
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
		return "Nome: " + nome + ".";
	}
}
