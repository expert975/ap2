/**
   01
*/

public class FuncionarioBanco
{
	private String nome;
	private float valorValeRefeicao;

	public void ajustarValePorTaxa(float taxa)
	{
		valorValeRefeicao = valorValeRefeicao*taxa + valorValeRefeicao;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public float getValorValeRefeicao()
	{
		return valorValeRefeicao;
	}

	public void setValorValeRefeicao(float valorValeRefeicao)
	{
		this.valorValeRefeicao = valorValeRefeicao;
	}

}
