/**
   04
*/

public class Pessoa
{
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade)
	{
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa(String nome)
	{
		this(nome, 0);
	}

	public Pessoa()
	{
		this("João", 0);
	}

	public void fazAniversario()
	{
		idade++;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getIdade()
	{
		return idade;
	}

	public void setIdade(int idade)
	{
		this.idade = idade;
	}

}
