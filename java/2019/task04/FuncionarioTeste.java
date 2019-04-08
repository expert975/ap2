/**
   01
*/

public class FuncionarioTeste
{
	public static void main(String args[])
	{
		FuncionarioBanco instance = new FuncionarioBanco();
		instance.setNome("João");
		instance.setValorValeRefeicao(2.20f);

		System.out.printf("%s ganha %.2f para almoçar\n", instance.getNome(),
						  instance.getValorValeRefeicao());

		instance.ajustarValePorTaxa(0.20f);

		System.out.printf("%s ganha %.2f para almoçar\n", instance.getNome(),
						  instance.getValorValeRefeicao());
	}
}
